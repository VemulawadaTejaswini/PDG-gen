import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int s = stdIn.nextInt();
			if(n == 0 && s == 0) {
				break;
			}
			int c1 = sorv(0, n, s,0);
			System.out.println(c1);
			
		}
	}
	public static int sorv(int i, int n, int s,int p) {
		if(s == p && n == 0) {
			return 1;
		}
		if(i >= 10) {
			return 0;
		}
		if(n < 0) {
			return 0;
		}

		if(p > s) {
			return 0;
		}
		int c1 = sorv(i+1,n-1,s,p+i);
		int c2 = sorv(i+1,n,s,p);
		return c1+c2;
	}
}