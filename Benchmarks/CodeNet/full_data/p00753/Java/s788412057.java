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
			
			int prime = 0;
			for(int i = n + 1; i <= 2*n ; i++){
				if(pg.isPrime(i)){
					prime++;
				}
			}
			
			System.out.println(prime);
		}
		
	}

}

class PrimeNumberGenerator {
    private boolean[] isPrime= new boolean[100000001];
 
    public PrimeNumberGenerator() {
        //Date from = new Date();
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
 
        for(int i = 3; i <= Math.sqrt( isPrime.length ); i+=2){
            /*
            if(i % 2 == 0){
                isPrime[i] = false;
                continue;
            }
            */
 
            if(isPrime[i] == false){
                continue;
            }
 
            for(int j = i * 2; j <= isPrime.length - 1; j += i){
                isPrime[j] = false;
            }
        }
        //Date to = new Date();
        //System.out.println("init takes "+ (to.getTime() - from.getTime())+ "milli sec");
    }
 
    public boolean isPrime(int index){
        if(index % 2 == 0 && index != 2){
            return false;
        }
        return isPrime[index];
    }
}