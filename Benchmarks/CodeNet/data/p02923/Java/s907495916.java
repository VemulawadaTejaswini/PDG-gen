import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int cnt = 0;
		int bh = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int h = sc.nextInt();
			if (bh >= h) {
				cnt++;
			} else {
				cnt = 0;
			}
			max = Math.max(max, cnt);
			
			bh = h;
		}
		
		System.out.println(max);
		
	}
}
