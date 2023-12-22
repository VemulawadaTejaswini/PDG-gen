import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int T = stdIn.nextInt();
			int P = stdIn.nextInt();
			int R = stdIn.nextInt();
			if(T == 0 && P == 0 && R == 0) break;
			Team[] teamData = new Team[T];
			for (int i = 0; i < T; i++) {
				teamData[i] = new Team(i);
			}
			for (int i = 0; i < R; i++) {
				int tID = stdIn.nextInt();
				int pID = stdIn.nextInt();
				int time = stdIn.nextInt();
				String message = stdIn.next();
				if (message.equals("WRONG")) {
					teamData[tID - 1].wdata[pID]++;
				}
				if (message.equals("CORRECT")) {
					teamData[tID - 1].c++;
					teamData[tID - 1].p += teamData[tID - 1].wdata[pID] * 1200
							+ time;
				}
			}
			Arrays.sort(teamData, new MyComparator());
			for (int i = 0; i < T; i++) {
				System.out.println(teamData[i].id + 1 + " " + teamData[i].c
						+ " " + teamData[i].p);
			}
		}
		
	}
}
class MyComparator implements Comparator<Team> {

	
	public int compare(Team o1, Team o2) {
		if(o1.c < o2.c) {
			return 1;
		}
		else if(o1.c > o2.c) {
			return -1;
		}
		else if(o1.p < o2.p) {
			return -1;
		}
		else if(o1.p > o2.p) {
			return 1;
		}
		else if(o1.id < o2.id) {
			return -1;
		}
		else if(o1.id > o2.id) {
			return 1;
		}
		return 0;
		
	}
	
}
class Team {
	public int id;
	public int c;
	public int p;
	public int[] wdata;
	
	public Team(int x) {
		id = x;
		c = 0;
		p = 0;
		wdata = new int[11];
	}
}