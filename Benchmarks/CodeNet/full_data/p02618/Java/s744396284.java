import java.util.*;
public class Main {

	public static void main(String[] args) {
		int INF = Integer.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int[] c = new int[26];
		Arrays.setAll(c, i -> sc.nextInt());
		int[][] s = new int[D][26];
		for(int i = 0; i < D; i++)
			Arrays.setAll(s[i], x -> sc.nextInt());
		int[] last = new int[26];
		for(int d = 1; d <= D; d++) {
			int max = -INF, now = 0;
			for(int i = 0; i < 26; i++) {
				int temp = 0;
				temp += s[d-1][i];
				for(int j = 0; j < 26; j++)
					if(i != j)
						temp -= c[j] * (d - last[j]);
				if(max < temp) {
					max = temp;
					now = i;
				}
			}
			System.out.println(now+1);
			last[now] = d;
		}
	}

}
