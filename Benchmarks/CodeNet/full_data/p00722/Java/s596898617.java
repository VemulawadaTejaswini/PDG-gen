import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrimeNumberGenerator pg = new PrimeNumberGenerator();

		while(true){
			String[] strarray = br.readLine().split(" ");

			int a = Integer.parseInt(strarray[0]);
			int d = Integer.parseInt(strarray[1]);
			int n = Integer.parseInt(strarray[2]);
			
			if(a == 0 && d == 0 && n == 0){
				break;
			}
			
			int primeNum = 0;
			int i = 0;
			while(true){
				if(pg.isPrime(a+i*d)){
					primeNum++;
					if(n == primeNum){
						System.out.println(a+i*d);
						break;
					}
				}
				
				i++;
			}
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