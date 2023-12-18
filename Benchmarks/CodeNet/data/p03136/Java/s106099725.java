import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] l = new int[n];
		int max = 0;
		int sum = 0;
		for(int i = 0;i < n; i ++) {
			if(max < l[i]) {
				max = l[i];
			}
			sum += l[i];
		}
		if(sum - 2 * max > 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
