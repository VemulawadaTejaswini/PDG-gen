import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int K = sc.nextInt();
		if(K >= Math.pow(2, M))
			System.out.println(-1);
		else if(M == 0)
			System.out.println("0 0");
		else if(M == 1) {
			if(K == 0)
				System.out.println("0 0 1 1");
			else
				System.out.println(-1);
		}
		else {
			StringBuilder ans = new StringBuilder();
			StringBuilder b = new StringBuilder();
			for(int i = 0; i < Math.pow(2, M); i++) {
				if(i == K)
					continue;
				b.append(i+" ");
			}
			ans.append(b);
			ans.append(K);
			ans.append(b.reverse());
			ans.append(" " + K);
			System.out.println(ans);
		}

	}

}
