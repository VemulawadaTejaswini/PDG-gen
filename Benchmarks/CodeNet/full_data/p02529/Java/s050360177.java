import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] check = new int[501];
		
		int cnt = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			check[sc.nextInt()]++;
		int m = sc.nextInt();
		for (int i = 0; i < m; i++)
			check[sc.nextInt()]++;
		for (int i = 0; i < check.length; i++)
			if (check[i] > 1) cnt++;
		
		System.out.println(cnt);

	}

}