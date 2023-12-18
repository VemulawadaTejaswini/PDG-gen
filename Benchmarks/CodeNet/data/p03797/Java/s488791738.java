import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int c =sc.nextInt();
		c -= s*2;
		c/=4;
		System.out.print(s+c);
		sc.close();
	}
}