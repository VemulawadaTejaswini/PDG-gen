import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Long A = sc.nextLong();
		double db = sc.nextDouble();
		Long tmp = (long) Math.floor(db*100);
		A *= tmp;

		Long ans = (long) Math.floor(A/100);

		System.out.println(ans);
		return;
	}
}