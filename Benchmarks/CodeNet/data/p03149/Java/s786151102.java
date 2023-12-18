import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner();
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int arr[] = {a, b, c, d};
        boolean mark[] = {false, false, false, false};
        int arr2[] = {1, 9, 7, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    mark[j] = true;
                }
            }
        }
        boolean ok = true;
        for (int i = 0; i < mark.length; i++) {
            if (!mark[i]) {
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static class Scanner {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        int spaces = 0;

        public String nextLine() throws IOException {
            if (spaces-- > 0) {
                return "";
            } else if (st.hasMoreTokens()) {
                return new StringBuilder(st.nextToken("\n")).toString();
            }
            return br.readLine();
        }

        public String next() throws IOException {
            spaces = 0;
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public boolean hasNext() throws IOException {
            while (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) {
                    return false;
                }
                if (line.equals("")) {
                    spaces = Math.max(spaces, 0) + 1;
                }
                st = new StringTokenizer(line);
            }
            return true;
        }
    }
}
