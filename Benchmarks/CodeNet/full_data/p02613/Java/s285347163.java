import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int t = Integer.parseInt(br.readLine());
            int[] a = new int[4];
            while(t-->0) {
                String s = br.readLine();
                if(s.equals("AC")) a[0]++;
                else if(s.equals("WA")) a[1]++;
                else if(s.equals("TLE")) a[2]++;
                else if(s.equals("RE")) a[3]++;
            }

            pw.println("AC x " + a[0]);
            pw.println("WA x " + a[1]);
            pw.println("TLE x " + a[2]);
            pw.println("RE x " + a[3]);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
