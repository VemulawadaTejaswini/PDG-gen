
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
        boolean ok=false;
        if((cad.indexOf("k")!=-1&&cad.lastIndexOf("eyence")!=-1)||(cad.indexOf("ke")!=-1&&cad.lastIndexOf("yence")!=-1)||(cad.indexOf("key")!=-1&&cad.lastIndexOf("ence")!=-1)||(cad.indexOf("keye")!=-1&&cad.lastIndexOf("nce")!=-1)||(cad.indexOf("keyen")!=-1&&cad.lastIndexOf("ce")!=-1)||(cad.indexOf("keyenc")!=-1&&cad.lastIndexOf("e")!=-1)||(cad.lastIndexOf("keyence")!=-1)){
            ok=true;
        }
        if (ok) {
            System.out.println("YES");
        }else
            System.out.println("NO");
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
