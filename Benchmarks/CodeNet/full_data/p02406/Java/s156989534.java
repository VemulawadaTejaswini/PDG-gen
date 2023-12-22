
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x;

		for(int i=1;i<=n;i++) {
			x =i;
			if(CHECK_NUM(x)) continue;

			if(INCLUDE3(x)) continue;
				x/=10;
			if(x==1) {
				INCLUDE3(x,i);
				continue;
			}
		}
		System.out.println();
		scan.close();
	}

	static boolean CHECK_NUM(int n) {
		if(n%3 == 0) {
			System.out.print(" "+n);
			return true;
		}
		return false;
	}

	static boolean INCLUDE3(int n) {
		if(n%10 == 3) {
			System.out.print(" "+n);
			return true;
		}
		return false;
	}
	static boolean INCLUDE3(int n,int i) {
		if(n%10 == 3) {
			System.out.print(" "+i);
			return true;
		}
		return false;
	}
}
