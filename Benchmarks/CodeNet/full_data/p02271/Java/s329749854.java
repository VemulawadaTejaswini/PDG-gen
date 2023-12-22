import java.util.Scanner;

public class Main {
	
	static int n;
	static int[] a;
	
	static boolean solve(int i,int x) {
		if(x == 0) {
			return true;
		}else if(i >= n) {
			return false;
		}
		boolean res = solve(i+1,x) || solve(i+1,x-a[i]);
		return res;
	}
	
	static void judge(int x) {
		if(solve(0,x)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	void main() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] m = new int[q];
		for(int i=0;i<q;i++) {
			m[i] = sc.nextInt();
		}
		
		for(int i=0;i<q;i++) {
			judge(m[i]);
		}
	}

	public static void main(String[] args) {
		new Main().main();
	}

}

