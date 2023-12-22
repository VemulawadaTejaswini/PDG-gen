import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        while(true){
            String tmp = br.readLine();
             
            if(tmp == null){
                break;
            }
 
            String[] tmpArray = tmp.split(" ");
            int a = Integer.parseInt(tmpArray[0]);
            int b = Integer.parseInt(tmpArray[1]);
             
            System.out.println(GCD(a,b) + " "+ LCM(a,b));
        }
    }
    
    static long GCD (long a, long b){
	    long candidate = a;
	    while (b % a != 0) {
	      candidate = b % a;
	      b = a;
	      a = candidate;
	    }
	    return candidate;
	}
    
    static long LCM (long a, long b){
		long GCD = GCD(a, b);
		//System.out.println("GCD("+a+","+b+") is "+GCD);
		return GCD * (a/GCD) * (b/GCD);
	}
 
}