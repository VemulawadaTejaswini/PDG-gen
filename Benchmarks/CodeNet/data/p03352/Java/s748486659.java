import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt()
    int a = 0, b, p, i, t;
		for(int b = 1;b <= x;b++) {
			int t = b;
			for(int p = 2;p <= x;p++) {
				int t *= b;
				if(t <=x && a < t) a = t;
			}
		}
		if(x == 1) a = 1;
		System.out.print(a);
	}
}
