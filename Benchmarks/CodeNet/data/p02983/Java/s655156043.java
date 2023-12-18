import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt() % 2019;
		int R = sc.nextInt() % 2019;
		if(L >= R)
			R += 2019;
		long ans = 2018;
		for(int i = L; i < R; i++)
			for(int j = i+1; j <= R; j++)
				ans = Math.min(ans, (i*j) % 2019);
		System.out.println(ans);
	}

}
