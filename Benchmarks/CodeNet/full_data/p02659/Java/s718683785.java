import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Long A = sc.nextLong();
		double db = sc.nextDouble();
		Long ans = (long) Math.floor(A*db);

		System.out.println(ans);
		return;
	}
}