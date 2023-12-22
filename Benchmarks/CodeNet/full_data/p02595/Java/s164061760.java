import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < N; i++)
			if(Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2) <= D * D)
				ans++;
		System.out.println(ans);
	}

}