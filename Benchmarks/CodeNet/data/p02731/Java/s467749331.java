import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		long a = L;
		long sum = a * a * a;
		double ans = sum/ 27;

		System.out.println(ans);
	}
}