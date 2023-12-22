import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        String target = st.nextToken();

        if(Character.isUpperCase(target.charAt(0))) {
            pw.println("A");
        } else {
            pw.println("a");
        }

        br.close();
        pw.close();
    }
}