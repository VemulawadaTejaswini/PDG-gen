
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int l = scan.nextInt();
		int k = scan.nextInt();

		//test
//		System.out.println(combination(50, 25));

		long result = 0;
		for(int thick = 0; thick <= 50; thick++){
			if(thick*k > l){
				break;
			}

			for(int thin = 0; thin <= 50; thin++){
				int height = thick*k + thin + (thick + thin - 1);

				if(height <= 0){
					continue;
				}
				if(height > l){
					break;
				}

				result += combination(thick + thin, thick);
			}
		}

		System.out.println(result);
	}

	static long combination(int n, int m){
//		long result = 1;
		BigInteger result = new BigInteger("1");

		int j = m;
		for(int i = 0; i < m; i++){
//			result *= n - i;
			result = result.multiply(BigInteger.valueOf(n - i));
		}

		for(int i = 1; i <= m ; i++){
//			result /= i;
			result = result.divide(BigInteger.valueOf(i));
		}

//		System.out.println(n+"C"+m+" = "+result.longValue());
		return result.longValue();
	}

}

