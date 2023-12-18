import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long ans = ((long)n * (long)(n - 1)) / 2;
		System.out.println(ans);
	}
}
