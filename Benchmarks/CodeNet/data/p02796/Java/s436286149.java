import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int len = sc.nextInt();
		int n[] = new int[len];
		int l[] = new int[len];
		int st[] = new int[len];
		int ed[] = new int[len];

		for (int i = 0; i < len; i++) {
			n[i] = sc.nextInt();
			l[i] = sc.nextInt();
        }
		for (int i = 0; i < len; i++) {
			st[i] = n[i] - l[i];
			ed[i] = n[i] + l[i];
        }

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ed[i] > ed[j]) {
					int wkst = st[i];
					int wked = ed[i];
					st[i] = st[j];
					ed[i] = ed[j];
					st[j] = wkst;
					ed[j] = wked;
                }
            }
        }
		int ans = 0;
		int cur = -1000000000;
		for (int i = 0; i < len; i++) {
			if (st[i] >= cur) {
				cur = ed[i];
				ans++;
            }
        }
		
//		for (int i = 0; i < len; i++) {
//			System.out.println(st[i] + " " + ed[i]);
//        }
		System.out.println(ans);
    }
}