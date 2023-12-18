import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), n = sc.nextInt();
		sc.close();
		int ans = 1;
		for(int i = 1; i <= d; ++i)
			ans *= 100;
		ans *= n;
		System.out.println(ans);
	}

}
