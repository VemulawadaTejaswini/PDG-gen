import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		int cnt = (b + a - 3) / (a - 1);
		System.out.println(cnt);
	}
}
