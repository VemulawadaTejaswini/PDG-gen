import java.util.*;

public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long N = sc.nextLong();

		if(B>N){
			Long ans = (long) Math.floor((A*N)/B);
			System.out.println(ans);
			return;
		}

		Long divideNB = (long) Math.floor(N/B);
		N = (divideNB*B) - 1;

		Long ans = (long) (Math.floor((A*N)/B) - A*(Math.floor(N/B)));
		System.out.println(ans);
		return;

	}


}
