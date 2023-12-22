import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for(int i=0; i<n; i++)
            s[i] = br.readLine();
        int ac = 0, wa = 0, tle = 0, re = 0;
        for(String w : s) {
            if(w.equals("AC"))
                ac++;
            else if(w.equals("WA"))
                wa++;
            else if(w.equals("TLE"))
                tle++;
            else
                re++;
        }
        System.out.println("AC x " + ac + "\nWA x " + wa + "\nTLE x " + tle + "\nRE x " + re);
    }
}