import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int x = stdIn.nextInt();
		
		int n = stdIn.nextInt();
		
		if(n == 0) {
			System.out.println(x);
			return;
		}
		
		
		
		int[] p = new int[n];
		
		boolean[] num = new boolean[100];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
			num[p[i]] = true;
		}
		
		Arrays.parallelSort(p);	
		
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		for(int i = x; i >= -10; i--) {
			if(!num[i]) {
				a = i;
				break;
			}
		}
		
		for(int i = x; i <= 103; i++) {
			if(!num[i]) {
				b = i;
				break;
			}
		}
		
		//int ans = Math.min(Math.abs(x-a), Math.abs(x-b));
		
		if(Math.abs(x-a) <= Math.abs(x-b)) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
	}
}
