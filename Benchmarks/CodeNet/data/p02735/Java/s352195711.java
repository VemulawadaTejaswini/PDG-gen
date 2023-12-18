import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[] s = new char[(H+1)*(W+1)];
		for(int i = 0; i < H; i++) {
			String S = sc.next();
			for(int j = 0; j < S.length(); j++)
				s[i*W+j] = S.charAt(j);
		}
		int[] n = new int[(H+1)*(W+1)];
		Arrays.fill(n, 10000);
		n[0] = 0;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.offer(0);
		Set<Integer> NG = new HashSet<>();
		for(int i = 0; i < H; i++)
			NG.add(i*W+W);
		while(q.size() > 0) {
			int x = q.poll();
			if(x + 1 >= H * W || NG.contains(x))
				continue;
			if(s[x+1] == s[x]) {
				if(n[x+1] > n[x]) {
					n[x+1] = n[x];
					q.offer(x+1);
				}
			}
			else {
				if(n[x+1] > n[x] + 1) {
					n[x+1] = n[x] + 1;
					q.offer(x+1);
				}
			}
			if(x + W >= H * W)
				continue;
			if(s[x+W] == s[x]) {
				if(n[x+W] > n[x]) {
					n[x+W] = n[x];
					q.offer(x+W);
				}
			}
			else {
				if(n[x+W] > n[x] + 1) {
					n[x+W] = n[x] + 1;
					q.offer(x+W);
				}
			}
		}
		if(s[0] == '#')
			System.out.println((n[H*W-1])/2 + 1);
		else
			System.out.println((n[H*W-1]+1)/2);

	}

}