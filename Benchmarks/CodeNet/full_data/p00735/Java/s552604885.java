import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MSPrimeGenerator msp = new MSPrimeGenerator();
		
		while (true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 1){
				break;
			}
			
			System.out.println(solve(n, msp));
		}

	}
	
	static String solve(int n, MSPrimeGenerator msp){
		StringBuffer sb = new StringBuffer();
		sb.append(n+":");
		
		for(int i = 6; i <= n; i++){
			if(n%i == 0 && msp.isPrime(i)){
				sb.append(" "+i);
			}
		}
		
		return sb.toString();
	}

}

class MSPrimeGenerator {
    private final int N = 300000;
    private boolean[] isPrime= new boolean[N + 1];
 
    public MSPrimeGenerator() {
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
 
//        int limit = (int)Math.sqrt(N);
        for(int i = 6; i <= N ; i++){
 
            if(isPrime[i] == false){
                continue;
            }
            
            if(!(i%7 == 1 || i%7 == 6)){
            	isPrime[i] = false;
            	continue;
            }
 
            for(int j = i * 2; j <= N; j += i){
                isPrime[j] = false;
            }
        }
    }
 
    public boolean isPrime(int index){
        return isPrime[index];
    }
}

