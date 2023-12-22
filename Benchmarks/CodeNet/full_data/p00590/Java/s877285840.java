import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			int n = Integer.parseInt(br.readLine());
			int count = 0;

			for(int i = 0; i < n; i++){
				if(isPrime(i+1)&&isPrime(n-i)) count++;
				/*
				if(gcd(i+1, n-i) == 1){
					count++;
				}
				*/
			}

			System.out.println(count);

		}catch(Exception e){
			System.err.println(e);
		}
	}

	static boolean isPrime(int n){
		for (int i = 2; i <= n - 1; i++){
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int gcd(int a, int b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a % b);
		}
	}
}