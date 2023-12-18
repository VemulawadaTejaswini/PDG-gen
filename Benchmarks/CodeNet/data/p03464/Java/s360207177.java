import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().start();
	}

	void start() {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int ary[] = new int[k];
		for(int i=0; i<k; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		int l = 2, r = 2;
		
		for(int i=k-1; i>=0; i--) {
			l = (int)Math.ceil((float)l/ary[i]) * ary[i];
			r = (int)Math.floor((float)r/ary[i]) * ary[i] + ary[i] - 1;
			if(!exist(l,r,ary[i])) {
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(l+" "+r);
	}
	
	boolean exist(int l, int r, int a) {
		for(int i=l; i<=r; i++) {
			if(i%a == 0) {
				return true;
			}
		}
		return false;
	}
}