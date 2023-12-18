
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		PrimeNumberGenerator pg = new PrimeNumberGenerator();
		int p = 2;
		
		//最低でも1は公約数
		int count = 1;
		
		while(a > 1 && b > 1 && p <= 1_000_000) {
			if(!pg.isPrime(p)) {
				p++;
				continue;
			}
			
//			System.out.println(a + " "+ b);
			if(a % p == 0 && b % p == 0) {
				count++;
			}
			
			while(a % p == 0) {
				a /= p;
			}
			
			while(b % p == 0) {
				b /= p;
			}
			p++;
		}
		
		if(a > 1 && b > 1 && a == b) {
			count++;
		}
		
		System.out.println(count);
	}

}

class PrimeNumberGenerator {
    private boolean[] isPrime= new boolean[1000001];
 
    public PrimeNumberGenerator() {
        //Date from = new Date();
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
 
        int limit = (int)Math.sqrt(isPrime.length);
        for(int i = 3; i <= limit; i+=2){
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
