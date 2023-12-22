
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		boolean res = false;

		res = magic(a,b,c,k);

		if(res) {
			System.out.printf("yes");
		} else {
			System.out.printf("no");
		}
	}

	static boolean magic(int a, int b, int c, int k) {
		int rd = a;
		int gr = b;
		int bl = c;
		int remain = k;

		while (gr <= rd) {
			gr *= 2;
			remain--;
			if(remain<0) {return false;}
		}

		while (bl <= gr) {
			bl *= 2;
			remain--;
			if(remain<0) {return false;}
		}
		return true;
	}
}
