import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n;
		
		boolean[] primes = new boolean[10000001];
		primes[0] = primes[1] = false;
		for(int i = 2; i < 10000000; i++){
			boolean judge = true;
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					judge = false;
					break;
				}
			}
			if(judge) primes[i] = true;
			else      primes[i] = false;
		}
		
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.parseInt(string);
			
			for(int i = n; i > 0; i--){
				if(primes[i] && primes[i - 2] && primes[i - 6] && primes[i - 8]){
					System.out.println(i);
					break;
				}
			}
		}
		reader.close();
	}
}