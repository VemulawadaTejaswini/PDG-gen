import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		try{

			while((str = br.readLine()) != null){
				int n = Integer.parseInt(str);
				int count = 0;

				if(n % 2 == 0){
					//nが偶数の場合は，2の相方だけ調べればいい
					if((n != 2)&&isPrime(n-1)) count = 2;
				}else{
					for(int i = 1; i < n-1; i++){
						if(isPrime(i+1)&&isPrime(n-i)) count++;
					}
				}
				System.out.println(count);
			}

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