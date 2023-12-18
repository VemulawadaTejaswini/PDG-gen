import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t = N;
		int f = 0;
		while(true) {
			if (t>0) {
				f += t%10;
				t = t/10;
			}else break;
		}
		if (N%f == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}
