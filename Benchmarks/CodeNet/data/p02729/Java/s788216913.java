import java.util.Scanner;
/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static int C(int a, int b) {
		b = Math.min(a-b,b);
		if (a==0||a==1)return 0;
		if (a==2)return 1;
		if (b==0)return 0;
		int i;
		int up = 1;
		for(i=0;i<b;i++) {
			up *= a-i;
		}
		int down = 1;
		for(i=1;i<=b;i++) {
			down *= i;
		}
		return up/down;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int ans = (C(n,2))+C(m,2);
		
		System.out.println(ans);
		
	}

}