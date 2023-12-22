import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String target = st.nextToken();

            switch (target) {
                case "AC" :
                    AC += 1;
                    break;
                case "WA" :
                    WA += 1;
                    break;
                case "TLE" :
                    TLE += 1;
                    break;
                case "RE" :
                    RE += 1;
                    break;
            }  
        }

        pw.println("AC x " + AC);
        pw.println("WA x " + WA);
        pw.println("TLE x " + TLE);
        pw.println("RE x " + RE);

        br.close();
        pw.close();
    }
}