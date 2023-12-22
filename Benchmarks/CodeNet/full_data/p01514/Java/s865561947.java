import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
 static class Team implements Comparable<Team> {
	final Integer num;
	final int[]   tryCounter;
	int           clear = 0;
	int           pena  = 0;

	Team(int num, int pCount) {
	 this.num = Integer.valueOf(num);
	 tryCounter = new int[pCount];
	}

	@Override
	public int compareTo(Team o) {
	 int result = Integer.signum(o.clear - clear);
	 if (result == 0) result = Integer.signum(pena - o.pena);
	 if (result == 0) result = Integer.signum(o.num - num);
	 return result;
	}

	@Override
	public String toString() {
	 return String.format("%d %d %d", num, clear, pena);
	}
 }

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	List<Team> teams = new ArrayList<Main.Team>();
	do {
	 teams.clear();
	 final int T = in.nextInt();
	 final int P = in.nextInt();
	 final int R = in.nextInt();
	 for (int i = 0; i < T; i++) {
		teams.add(new Team(i + 1, P));
	 }
	 for (int r = 0; r < R; r++) {
		recored(
		  teams.get(in.nextInt() - 1),
		  in.nextInt(),
		  in.nextInt(),
		  in.next());
	 }
	 Collections.sort(teams);
	 for (Team team : teams) {
		System.out.println(team);
	 }
	} while (in.hasNext());
 }

 private static void recored(
	 Team team, int pID, int time, String next) {
	if (next.equals("CORRECT")) {
	 team.clear++;
	 team.pena += team.tryCounter[pID - 1] * 1200 + time;
	} else {
	 team.tryCounter[pID - 1]++;
	}

 }
}