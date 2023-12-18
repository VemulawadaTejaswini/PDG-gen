import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int K = sc.nextInt();
		if(K >= Math.pow(2, M))
			System.out.println(-1);
		else if(M == 0)
			System.out.println(0 + " " + 0);
		else if(M == 1) {
			if(K == 0)
				System.out.println(0 + " " + 0);
			else
				System.out.println(-1);
		}
		else {
			StringBuilder b = new StringBuilder();
			for(int i = 0; i < Math.pow(2, M); i++) {
				if(i == K)
					continue;
				b.append(i+" ");
			}
			StringBuilder c = new StringBuilder(b);
			System.out.println(b + "" + K + c.reverse() + " " + K);
		}

	}

}