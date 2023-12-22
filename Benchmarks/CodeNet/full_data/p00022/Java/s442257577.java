import java.util.Scanner;
public class Main {
	public static int ms(int[] a) {
		int min = 0;
		int x = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			x += a[i];
			max = Math.max(max, x-min);
			min = Math.min(min, x);
		}
		return max;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n==0) break;
				int[] a = new int[n];
				for(int i=0; i<n; i++) {
					a[i] = sc.nextInt();
				}
				System.out.println(ms(a));
			}
		}
	}
}

