import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] monsters = new int[n];
		for (int i = 0; i < n; i++) {
			monsters[i] = sc.nextInt();
		}
		Arrays.sort(monsters);
		
		long left = 0;
		long right = 1000000000;
		
		long m = 0;
		while(right-left > 1) {
			m = (right + left) / 2;
			if(check(monsters, a, b, m)) {
				right = m;
			} else {
				left = m;
			}
		}
		System.out.println(m);
	}
	
	private static boolean check(int[] mon, long max, long ave, long m) {
		
		long num = m;
		for(int i = 0; i<mon.length && num >= 0;i++) {
			long hp = mon[i] - ave*m;
			if(hp > 0) {
				long minus = hp /(max-ave) + 1;
				num -= minus;
			}
		}
		
		return num >= 0;
	}
}