
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		long C = 0;
		long pair =((B-A)/2);

		if(pair%2 == 0){
			C = 0 ;
		}
		else{
			C = 1;
		}

		long ans = 0;

		if(A%2 == 0 && B%2 == 0){
			ans = B^C;
		}
		else if(A%2 != 0 && B%2 == 0){
			ans = (A^B)^C;
		}
		else if(A%2 == 0 && B%2 != 0){
			ans = C;
		}
		else if(A%2 != 0 && B%2 != 0){
			ans = A^C;
		}

		System.out.println(ans);

	}
}

