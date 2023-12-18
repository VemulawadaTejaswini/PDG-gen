import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] hasSnack= new int[n];
		
		for(int i = 0; i < k; i++){
			int d = sc.nextInt();
			for(int j = 0; j < d; j++){
				int a = sc.nextInt();
				hasSnack[a - 1]++;
			}
		}

		int ans = 0;
		for(int i = 0; i < n; i++){
			if(hasSnack[i] == 0) {
				ans++;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}