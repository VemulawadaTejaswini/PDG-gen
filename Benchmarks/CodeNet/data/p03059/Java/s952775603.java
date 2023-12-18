import java.util.*;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();

		double lim = Math.floor((T + 0.5) / A);
		int sum = 0;
		for (int i = 1; i <= lim; i++){
			sum += B;
		}	
		sc.close();
		System.out.println(sum);

	}	
}