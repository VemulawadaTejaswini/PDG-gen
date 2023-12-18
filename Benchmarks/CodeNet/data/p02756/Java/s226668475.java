import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static int nextInt() {
        try {
            in.nextToken();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (int) in.nval;
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String s = in.next();
        LinkedList<String> st = new LinkedList<String>();
        st.add(s);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = nextInt();
        boolean a = false;
        for (int i = 0; i < n; i++) {
            int op = nextInt();
            if (op == 1)
                a = !a;
            else {
                int x = nextInt();
                String c = in.next();
                if ((x == 1 && !a) || (x == 2 && a))
                    st.addFirst(c);
                else
                    st.addLast(c);
            }
        }
        if (!a)
            while (!st.isEmpty())
                out.print(st.pollFirst());
        else {
            while (!st.isEmpty())
                out.print(st.pollLast());
        }
        out.flush();
    }

}
