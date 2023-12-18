import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i ++) {
			l[i] = sc.nextInt();
		}
		sc.close();
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
