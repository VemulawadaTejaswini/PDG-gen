import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+2];
		int total = 0;
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
			total += Math.abs(a[i]-a[i-1]);
		}
		total += Math.abs(a[N]);
		StringBuilder ans = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			int dist = total + Math.abs(a[i+1]-a[i-1]) - Math.abs(a[i]-a[i-1]) - Math.abs(a[i+1]-a[i]);
			ans.append(dist + "\n");
		}
		System.out.println(ans);
	}

}