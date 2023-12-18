import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] lengths = new int[n];
		
		for (int i = 0; i < n; i++) {
			lengths[i] = sc.nextInt();
		}
		
		sc.close();
		
		// now we need a way of sorting through all of the sticks
		int ans = 0;
		
		for (int i = 0; i < k; i++) {
			int temp = 0;
			for (int j = 0; j < n; j++) {
				if (lengths[j] >= lengths[temp]) {
					temp = j;
					// we also need a way of removing the maximum here
				}
			}
			ans += lengths[temp];
			lengths[temp] = 0;
		}
		
		System.out.println(ans);
	}

}
