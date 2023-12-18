import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] clock = new long[n];
		for(int i = 0; i < n; i++){
			clock[i] = Long.parseLong(br.readLine());
		}
		
		long result = clock[0];
		for(int i = 1; i < n; i++){
			result = LCM(clock[i - 1], clock[i]);
		}
		
		System.out.println(result);
	}

	static long GCD(long a, long b){
		if(b > a){
            long tmpInt = b;
            b = a;
            a = tmpInt;
        }

		long GCD = 1;
         
        long j = b;
        while(j > 1){
            if(a%j == 0 && b%j == 0){
                GCD *= j;
                a/=j;
                b/=j;
                j = b;
            }
            else {
                j--;
            }
        }
        
        return GCD;
	}
	
	static long LCM (long a, long b){
		long GCD = GCD(a, b);
		//System.out.println("GCD("+a+","+b+") is "+GCD);
		return GCD * (a/GCD) * (b/GCD);
	}
}
