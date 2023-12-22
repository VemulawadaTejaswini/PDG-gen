import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PrimeNumberGenerator png = new PrimeNumberGenerator();
		int count = 0;

		for(int i = 0; i < n; i++){

			int m = Integer.parseInt(br.readLine());


			if(png.isPrime(m)){
					//System.out.println(i);
				count++;
			}


		}
		System.out.println(count);
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