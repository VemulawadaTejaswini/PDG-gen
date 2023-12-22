import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String S = br.readLine();
        
        if(S.equals("ABC")) {
            pw.println("ARC");
        } else {
            pw.println("ABC");
        }

        br.close();
        pw.close();
    }
}