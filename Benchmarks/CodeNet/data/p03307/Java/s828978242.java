import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = 2 * n;
		if(n % 2 == 0)ans = n;
		System.out.println(ans);
	}

}
