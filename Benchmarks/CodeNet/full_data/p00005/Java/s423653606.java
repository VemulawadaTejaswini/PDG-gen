
import java.io.*;

public class Main {
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String s;
        while ((s = br.readLine()) != null) {
            String[] lc = s.split(" ");
            int a = Integer.parseInt(lc[0]);
            int b = Integer.parseInt(lc[1]);
            
            int gcd = gcd(a,b);
            int lcm = a / gcd * b;
            
            System.out.println(gcd + " " + lcm);
        }
 
    }
    
    private static int gcd(int a, int b) {
    	while(b!=0){
    		int aa = a;
    		a = b;
    		b = aa%b;
    	}
    	return a;
    }
}