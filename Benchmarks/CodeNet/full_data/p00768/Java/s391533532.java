import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	int T, P, R;
	List<Team> teams;
	Map<Integer, Integer> pena;


	public static void main(String[] args) {
		while(true) {
			int m = sc.nextInt();
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if(m==0 && t==0 && p==0 && r==0) break;
			Main main = new Main(t, p, r);
			main.action();
			main.print();
		}
	}

	Main(int T, int P, int R) {
		this.T=T; this.P=P; this.R=R;
		teams = new ArrayList<Team>(T+1);
		for(int i=0; i<T; i++) {
			teams.add(new Team(i+1));
		}
		pena = new HashMap<Integer, Integer>();
	}

	void action() {
		for(int i=0; i<R; i++) {
			int m = sc.nextInt();
			int t = sc.nextInt() - 1;
			int p = sc.nextInt();
			int r = sc.nextInt();

			if(r == 0) {
				Team team = teams.get(t);
				team.maru++;
				team.time += m + getPena(t, p);
			} else {
				setPena(t, p);
			};
		}
		Collections.sort(teams);
	}

	void print() {
		for(int i=0; i<T; i++) {
			System.out.print(teams.get(i).numb);
			if(i == T-1) continue;
			if(teams.get(i).eq(teams.get(i+1))) {
				System.out.print("=");
			} else {
				System.out.print(",");
			}
		}
		System.out.println();
	}

	int getPena(int t, int p) {
		int key = (P+1)*t + p;
		if(pena.containsKey(key)) {
			return pena.get(key);
		} else {
			return 0;
		}
	}

	void setPena(int t, int p) {
		int key = (P+1)*t + p;
		int val = 20;
		if(pena.containsKey(key)) {
			val += pena.get(key);
		}
		pena.put(key, val);
	}
}


class Team implements Comparable<Team> {
	int numb;
	int maru = 0;
	int time = 0;

	Team(int n) {
		numb = n;
	}

	boolean eq(Team op) {
		if(maru != op.maru) return false;
		if(time != op.time) return false;
		return true;
	}

	@Override
	public int compareTo(Team op) {
		int ret = op.maru - maru;
		if(ret == 0) ret = time - op.time;
		if(ret == 0) ret = op.numb - numb;
		return ret;
	}
}