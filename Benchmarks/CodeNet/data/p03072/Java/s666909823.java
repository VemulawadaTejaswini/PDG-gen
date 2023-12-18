import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int[] h = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		
		int res = 1;
		
		for(int i = 1; i < n; i++) {
			if(h[0] <= h[i] || h[0] <= h[1]) {
				if(h[i] <= h[i] || h[1] <= h[i]) {
					if(h[i-1] <= h[i]) {
						res++;
					}
				}
			}
		}
		
		System.out.println(res);
	}
}
