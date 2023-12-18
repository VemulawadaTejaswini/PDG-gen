
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int sum = 0;
		for(int i = 1; i <= k; i++){
			for(int j = 1; j <= k; j++){
				for(int l = 1; l <= k; l++){
					sum += gcd(gcd(i,j),l);
				}
			}
		}
		System.out.println(sum);
	}

	public static int gcd(int a, int b){
		if(a % b == 0){
			return b;
		}
		return gcd(b, a % b);
	}

}
