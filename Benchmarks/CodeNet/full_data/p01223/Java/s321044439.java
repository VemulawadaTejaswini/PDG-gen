import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tt=0;tt<t;tt++) {
			int n = sc.nextInt();
			int[] h = new int[n];
			for(int i=0;i<n;i++) {
				h[i] = sc.nextInt();
			}
			int up = 0;
			int down = 0;
			for(int i=0;i<n-1;i++) {
				up = Math.max(up,h[i+1]-h[i]);
				down = Math.max(down,h[i]-h[i+1]);
			}
			System.out.println(up + " " + down);
		}
	}

}