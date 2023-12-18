import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		boolean flag = true;

		for(int i = 0; i < n; i++) h[i] = sc.nextInt();

		if((h[0] - h[1]) > 1) {
			flag = false;
		}else if((h[0] - h[1]) == 1) {
			h[0]--;
		}
		if(flag)
		for(int i = 1; i < n-1; i++) {
			if((h[i] - h[i+1]) == 1 && (h[i] - h[i-1]) >= 1) {
				h[i]--;
			}else if((h[i] - h[i+1]) > 1 || ((h[i] - h[i+1]) == 1 && (h[i] - h[i-1]) == 0)) {
				flag = false;
				break;
			}
		}

		System.out.print(flag ? "Yes" : "No");

		sc.close();
	}
}