import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] height= new int[n];
		boolean[] isGood= new boolean[n];
		
		for(int i = 0; i < n; i++){
			height[i] = sc.nextInt();
			isGood[i] = true;
		}

		for(int i = 0; i < m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(height[a - 1] < height[b - 1]) {
				isGood[a - 1] = false; 
			}else {
				isGood[b - 1] = false;
			}
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++){
			if(isGood[i]) {
				ans++;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}