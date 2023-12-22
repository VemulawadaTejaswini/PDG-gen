import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrimeNumberGenerator pg = new PrimeNumberGenerator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			int n = Integer.parseInt(str);
			
			int smallPrime = 2;
			int bigPrime = Integer.MAX_VALUE;
			
			//?°??????????
			for(int i = n - 1; i >= 2 ; i--){
				if(pg.isPrime(i)){
					smallPrime = i;
					break;
				}
			}
			
			//??§?????????
			for(int i = n + 1; i <= Integer.MAX_VALUE ; i++){
				if(pg.isPrime(i)){
					bigPrime = i;
					break;
				}
			}
			
			System.out.println(smallPrime+" "+bigPrime);
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