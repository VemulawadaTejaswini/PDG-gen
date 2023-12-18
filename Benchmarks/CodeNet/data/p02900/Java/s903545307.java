import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = gcm (a, b);
		int count = 1;
		boolean[] ispr = new boolean[1000000];
		for(int i = 0; i < ispr.length; i++) {
			ispr[i] = true;
		}
		ispr[0] = false;
		ispr[1] = false;
		int n = (int)Math.sqrt(g);
		n++;
		for(int i = 2; i <= n; i++) {
			if(ispr[i]) {
				if(g%i == 0) count++;
				for(int j = 1; j*i <= n; j++) {
					ispr[j] = false;
				}
			}
		}
		System.out.println(count);
		sc.close();

	}
	private static  int gcm(int a, int b) {
		if(a<b) return gcm(b, a);
		if(b ==0) return a;
		return gcm(b, a%b);
	}
}