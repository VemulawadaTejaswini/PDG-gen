
import java.util.*;

class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		
		long ans = 0;
		ans = A * (Math.round(B * 100)) / 100 ;
		
		System.out.println(ans);

		
	}

}


