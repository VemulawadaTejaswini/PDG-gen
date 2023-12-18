import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		long p=1;
		int x=1;
		for(int i=0;i<9;i++) {
			x *=10;
		}
		for(int i=1;i<=c;i++) {
			p *= i;
			p %= (x+7);
		}
		System.out.print(p);
		sc.close();
	}
}
