import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int max=0;
		for(int i=2;i<1001000;i++) {
			boolean flag = true;
			for(int j=0;j<max;j++){
				if(i%primes[j]==0){
					flag = false;
					break;
				}
			}
			if(flag){
				primes[max++] = i;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		while ((s = br.readLine()) != null) {
			int data = Integer.parseInt(s);

			System.out.println(countPrime(data));
		}
	}
	
	private static int countPrime(int n){
		int i=0;
		
		while(primes[i]<=n)i++;
		
		return i;
	}
	
	static int[] primes = new int[80000];
}