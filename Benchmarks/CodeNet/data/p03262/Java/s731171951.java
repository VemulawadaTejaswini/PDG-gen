import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int X = scn.nextInt();
		int ans = 0;
		for(int i = 0;i < N;i++) {
			int x =Math.abs(scn.nextInt() - X);
			if(i == 0) {
				ans = x;
			}else {
				ans = yaku(ans,x);
			}
		}
		System.out.println(ans);
		scn.close();
	}
	public static int yaku(int a,int b) {
		if(a > b) {
			int buf = a;
			a = b;
			b = buf;
		}
		while(b%a !=0) {
			int buf = b%a;
			b = a;
			a = buf;
		}
		return a;
	}
}
