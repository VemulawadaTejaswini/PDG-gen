import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int res = 0;
		for (int i=A; i<=B; i++) {
			int l1 = i%10; int l2 = i/10000%10;
			int f1 = i/10%10; int f2 = i/1000%10;
			if ( l1 == l2 && f1 == f2) res ++;
		}
		System.out.println(res);
	}
}