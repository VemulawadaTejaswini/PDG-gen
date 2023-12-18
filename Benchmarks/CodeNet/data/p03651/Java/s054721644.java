import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flg = false;
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];

		for (int i=0; i < n; i++){
			a[i] = sc.nextInt();
		}

		for (int i=0; i < n; i++){
			if (a[i] == k){
				System.out.println("POSSIBLE");
				sc.close();
				return;
			}
		}

		//小さい順に並び替え
		Arrays.sort(a);

		int sa = a[n-1] - a[0];

		if (sa > a[n-2]){
			System.out.println("POSSIBLE");
		}else{
			System.out.println("IMPOSSIBLE");
		}

		sc.close();
	}

}
