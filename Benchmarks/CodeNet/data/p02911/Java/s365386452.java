import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] ans = new int[n];
		
		int kizyun = q-k+1;
		
		for(int i = 0; i < q; i++) {
			int num = sc.nextInt();
			ans[num-1]++;
		}
		
		if(kizyun <= 0) {
			for(int i = 0; i < n; i++) {
				System.out.println("Yes");
			}
		}
		
		for(int answer : ans) {
			if(answer >= kizyun) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		

	}
}
