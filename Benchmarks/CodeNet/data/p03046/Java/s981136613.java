import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = 1 << sc.nextInt();
		int K = sc.nextInt();
		if(M == 2 && K == 0)
			System.out.println("0 0 1 1");
		else if(K >= M || M == 2)
			System.out.println(-1);
		else {
			StringBuilder ans = new StringBuilder();
			StringBuilder b = new StringBuilder();
			for(int i = 0; i < M; i++)
				if(i != K)
					b.append(i+" ");
			StringBuilder c = new StringBuilder();
			for(int i = M-1; i >= 0; i--)
				if(i != K)
					c.append(i+" ");
			ans.append(b).append(K + " ").append(c).append(K);
			System.out.println(ans);
		}
	}

}
