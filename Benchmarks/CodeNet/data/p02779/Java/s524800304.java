import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean flag = judge(n, a);
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}




	}

	private static boolean judge(int n, int[] a) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if(a[i] == a[j]){
					return false;
				}
			}
		}
		return true;
	}

}
