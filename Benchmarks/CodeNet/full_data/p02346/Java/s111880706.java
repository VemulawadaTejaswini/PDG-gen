import java.util.*;

public class Main {
	static int MAX_N = 100000;
	static int n;
	static int[] bit = new int[MAX_N];
	
	// [0..i]の区間の和
	static int sum(int i) {
		int s = 0;
		while(i>0) {
			s += bit[i];
			i -= i & -i;
		}
		return s;
	}
	
	static void add(int i, int x) {
		while(i<=n) {
			bit[i] += x;
			i += i & -i;
		}
	}
	
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int q = sc.nextInt();
		for(int i=0; i<q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(com==0) {
				add(x, y);
			} else {
				System.out.println(sum(y)-sum(x-1));
			}
		}
		
	}
}

