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
	
		PrimeNumberGenerator pg = new PrimeNumberGenerator();
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			if(pg.isPrime(n)){
				System.out.println(0);
				continue;
			}
			
			int begin = -1;
			int end = -1;
			for(int i = n - 1; i >= 0; i--){
				if(pg.isPrime(i)){
					begin = i;
					break;
				}
			}
			
			for(int i = n + 1; i < 2000000 ; i++){
				if(pg.isPrime(i)){
					end = i;
					break;
				}
			}
			
			System.out.println(end - begin);
		}
	}

}

class PrimeNumberGenerator {
    private final int N = 2000000;
    private boolean[] isPrime= new boolean[N + 1];
 
    public PrimeNumberGenerator() {
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
 
        int limit = (int)Math.sqrt(N);
        for(int i = 2; i <= limit ; i++){
 
            if(isPrime[i] == false){
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