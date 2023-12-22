import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int c = sc.nextInt();
			int a = sc.nextInt();
			int n = sc.nextInt();
			int z = Math.min(Math.min(c, a), n);
			c -= z;
			a -= z;
			int x = Math.min(c,a);
			c -= x * 2;
			int y = c / 3;
			System.out.println(x + y + z);
		}
	}

}