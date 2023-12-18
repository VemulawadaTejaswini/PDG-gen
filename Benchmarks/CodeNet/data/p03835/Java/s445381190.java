import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long cnt = 0;
		int K = input.nextInt();
		int S = input.nextInt();
		int A = S/3;
		int B = (S-A)/2;
		int C = S-A-B;
		for (int a = 0; a <= A; a++) {
			for (int b = 0; b <= B; b++) {
				int c = S-a-b;
				if (c<=K) {
					if (Three(a,b,c)) cnt+=6;
					else if (One(a,b,c)) cnt++;
					else cnt+=3;
				}
			}
		}
		System.out.println(cnt);
	}
	public static boolean Three(int a, int b, int c) {
		if (a!=b&&b!=c&&c!=a) return true;
		return false;
	}
	public static boolean One(int a, int b, int c) {
		if (a==b&&b==c&&c==a) return true;
		return false;
	}
}