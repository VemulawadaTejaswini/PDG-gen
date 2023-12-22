import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		
		int i;
		
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			System.out.print(a[n - 1 - i] + " ");
		}
		
		System.out.println();

	}

}