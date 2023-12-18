import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int c =sc.nextInt();
		System.out.print((s*2+c)>>2);
		sc.close();
	}
}