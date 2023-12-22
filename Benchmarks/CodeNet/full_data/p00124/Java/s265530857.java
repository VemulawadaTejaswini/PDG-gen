/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	static int n;
	static Team[] teams;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		n = sc.nextInt();
		if(n == 0) return false;
		teams = new Team[n];
		
		int w,l,d;
		String name;
		for(int i = 0; i < n; i++) {
			name = sc.next();
			w = sc.nextInt(); l = sc.nextInt(); d = sc.nextInt();
			
			teams[i] = new Team(w * 3 + d, name);
		}
		return true;
	}
	
	static void solve() {
		sort(teams);
		for(int i = n - 1; i >= 0; i--) {
			System.out.println(teams[i].name + "," + teams[i].score);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}
}

class Team implements Comparable<Team> {
	int score;
	String name;
	
	Team(int score, String name) {
		this.score = score; this.name = name;
	}
	
	public int compareTo(Team t) {
		if(this.score != t.score) {
			return this.score - t.score;
		} else {
			return this.name.compareTo(t.name);
		}
	}
}