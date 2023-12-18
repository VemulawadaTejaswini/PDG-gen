import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int sumN = getSum(n);
		int sumM = getSum(m);

		System.out.println(sumM+sumN);
	}

	private static int getSum(int k) {
		if (k==0 || k==1) {
			return 0;
		} else {
			return k*(k-1)/2;
		}
	}

}
