import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] city = new int[n];
		for(int i = 0;i < n; i++) {
			city[i] = 0;
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			city[a]++;
			city[b]++;
		}
		for(int i:city) {
			System.out.println(i);
		}
	}
}
