import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

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
        in.nextToken();
        StringBuffer s = new StringBuffer(in.sval);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = nextInt(), a = 0;
        for (int i = 0; i < n; i++) {
            int op = nextInt();
            if (op == 1)
                a++;
            else {
                int x = nextInt();
                in.nextToken();
                String c = in.sval;
                int f = a & 1;
                if ((x == 1 && f == 0) || (x == 2) && f == 1)
                    s.insert(0, c);
                else
                    s.append(c);
            }
        }
        int f = a & 1;
        if (f == 0)
            out.println(s);
        else {
            String ss = s.reverse().toString();
            out.print(ss);
        }
        out.flush();
    }

}
