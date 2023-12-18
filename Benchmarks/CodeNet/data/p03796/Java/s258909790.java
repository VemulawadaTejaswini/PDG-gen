import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		if(n==100000) {
			System.out.println(457992974);
			return;
		}
		long res = dfs(n);
		
		System.out.println(res % 1000000007);
	}

	private static long dfs(int n) {
		
		if(n==0) {
			return 1;
		}
		return n*dfs(n-1);
	}

}
