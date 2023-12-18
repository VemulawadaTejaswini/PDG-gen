
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
        String pre[] = {"", "k", "ke", "key", "keye", "keyen", "keyenc", "keyence"};
        String suf[] = {"", "e", "ce", "nce", "ence", "yence", "eyence", "keyence"};
//        String sub=cad.sub
        boolean ok = false;
        String prefijo = "";
        String sufijo = "";
        for (int k = 0; k < cad.length(); k++) {
            for (int l = k; l < cad.length(); l++) {
                prefijo = cad.substring(k, l+1);
//                System.out.println(prefijo);
                for (int i = 0; i < pre.length; i++) {
                    if (pre[i].equals(prefijo)) {
                        for (int m = l; m < cad.length(); m++) {
                            for (int n = m; n < cad.length(); n++) {
                                sufijo = cad.substring(m, n+1);
//                                System.out.println(sufijo);
                                if(sufijo.equals(suf[suf.length-1-i])){
                                    ok=true;
                                }
                            }
                        }
                    }

                }
            }
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
