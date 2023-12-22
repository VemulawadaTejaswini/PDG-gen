import java.util.Arrays;
import java.util.Scanner;
public class Main{

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
		int a = x;
		int b = x;
		
		int c = Integer.MAX_VALUE;
		int d = Integer.MAX_VALUE;
		boolean flaga = false;
		boolean flagb = false;
		
		while(true) {
			
			if((!num[a]) && a <=100) {
				c = a;
				flaga = true;
			}
			a++;
			
			if((!num[b]) && b >= 1) {
				d = b;
				flagb = true;
			}
			b--;
			
			if(flaga || flagb)break;
		}
		
		if(flaga && flagb) {
			System.out.println(d);
		}else if(flaga) {
			System.out.println(c);
		}
		
		
		
		
	}

}
