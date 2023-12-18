import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int cost = 0;
		for(int i = 0 ; i < m ; i++) {
			int mi = sc.nextInt();
			if(mi < x) {
				cost++;
			}
		}
		int a = Math.min(cost,m - cost );
		System.out.println(a);
	}

}
