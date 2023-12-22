import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		Sns sns = new Sns(n);

		int m = scan.nextInt();
		for (int i = 0; i < m; i++)
			sns.add(scan.nextInt(), scan.nextInt());

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			if (sns.isFriends(scan.nextInt(), scan.nextInt()))
				System.out.println("yes");
			else
				System.out.println("no");

		scan.close();
		System.exit(0);
	}
}

class Sns {

	class Member {
		List<Integer> friend = new ArrayList<Integer>(3);
		int group = -1;
	}

	Member[] member;

	public Sns(int n) {
		member = new Member[n];
		for (int i = 0; i < n; i++)
			member[i] = new Member();
	}

	public boolean isFriends(int s, int t) {
		if (member[s].group == -1)
			setGroup(s);
		if (member[s].group == member[t].group)
			return true;
		else
			return false;
	}

	private void setGroup(int s) {
		member[s].group = s;
		int[] que = new int[member.length];
		que[0] = s;
		int pp = 0, pn = 1;
		for (; pp < pn; pp++) {
			for (int i = 0; i < member[que[pp]].friend.size(); i++) {
				int next = member[que[pp]].friend.get(i);
				if (member[next].group == -1) {
					member[next].group = s;
					que[pn++] = next;
				}
			}
		}
	}

	public void add(int s, int t) {
		member[s].friend.add(t);
		member[t].friend.add(s);
	}

}