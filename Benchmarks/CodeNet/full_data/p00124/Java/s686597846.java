import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
	private	static	BufferedReader	br = null;
	private	static	TeamCmp			tc = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		tc = new TeamCmp();
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		Team[]	team = null;
		int		cnt  = 0;

		while ((team = parseTeam()) != null) {
			if (cnt++ > 0) {
				System.out.println("");
			}

			for (int i = 0; i < team.length; i++) {
				System.out.println(String.format("%s,%d", team[i].nm, team[i].pt));
			}
		}
	}

	private static Team[] parseTeam() {
		Team[]	team = null;
		int		cnt  = parseNum();

		if (cnt > 0) {
			String	stdin = null;

			team = new Team[cnt];
			for (int i = 0; i < team.length; i++) {
				team[i] = new Team();
				if ((stdin = parseStdin()) != null) {
					String[]	lines = stdin.split(" ");

					team[i].nm = lines[0];
					team[i].no = i+1;
					team[i].pt = Integer.parseInt(lines[1])*3+Integer.parseInt(lines[3]);
				}
			}
			Arrays.sort(team, tc);
		}

		return team;
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}

class Team {
	public	String	nm = null;
	public	int		no = 0;
	public	int		pt = 0;
}

class TeamCmp implements Comparator<Team> {
   public int compare(Team tm1, Team tm2) {
       return (tm2.pt != tm1.pt) ? tm2.pt - tm1.pt : tm1.no - tm2.no;
   }
}