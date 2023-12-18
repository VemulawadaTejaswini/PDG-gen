import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner();
        String cad = sc.next();
        char arr[] = {'k', 'e', 'y', 'e', 'n', 'c', 'e'};
        boolean ok = false;
        int ind = 0;
        int saltos = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == arr[ind]) {
                ind++;
            }
            if (ind > 6) {
                ok = true;
                break;
            }
        }
        
        ind = 0;
        int count = 0;
        for (int i = 0; i < cad.length() - 1; i++) {
            if (ind>6||(cad.charAt(i) != arr[ind] && cad.charAt(i + 1) != arr[ind+1])) {
               continue;
            }
            if (cad.charAt(i) == arr[ind] && cad.charAt(i + 1) == arr[ind+1]) {
                count++;
            }
            if (cad.charAt(i) == arr[ind] && cad.charAt(i + 1) != arr[ind+1]) {
                saltos++;
            }
            if (cad.charAt(i) == arr[ind]) {
                ind++;
            }
        }
        if (saltos >= 2) {
            ok = false;
        }
        if (ok) {
            System.out.println("YES");
        } else {
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
