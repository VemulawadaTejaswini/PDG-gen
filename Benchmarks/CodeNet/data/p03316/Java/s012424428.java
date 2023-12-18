import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N, s = 0;
		for(int i = 0;i < 9;i++) {
			s += n % 10;
			n = n / 10;
		}
		if(N % s == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}