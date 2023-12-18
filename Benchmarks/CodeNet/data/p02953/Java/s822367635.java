
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] height = new int[n];
		s.close();
		String judge = "Yes";
		for(int i = 1; i <= n ; i++) {
			if(height[i-1] -1 > height[i]) {
				judge = "No";
				break;
			}
		}
		System.out.println(judge);
	}

}
