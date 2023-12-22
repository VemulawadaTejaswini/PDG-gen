import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int oldRank = -1;
        Scanner sc = new Scanner(System.in);
        List<Team> team = new ArrayList<Team>();
        while (true) {
            String[] in = sc.nextLine().split(",");
            int num = Integer.parseInt(in[0]);
            int ac = Integer.parseInt(in[1]);
            if (num == 0 && ac == 0) {
                break;
            }
            team.add(new Team(num, ac));
        }
        Collections.sort(team, new Team());
        for (Team t : team) {
            if (oldRank == -1) {
                oldRank = t.getAccept();
            }
            if (oldRank != t.getAccept()) {
                i++;
            }
            t.setRank(i);
            oldRank = t.getAccept();
        }
        while (sc.hasNext()) {
            int teamNumber = sc.nextInt();
            for (Team t : team) {
                if (teamNumber == t.getTeamNum()) {
                    System.out.println(t.getRank());
                }
            }
        }
    }
}
class Team implements Comparator<Team> {
    private int teamNumber;
    private int teamAccept;
    private int teamRank;

    public Team(int num, int ac) {
        this.teamNumber = num;
        this.teamAccept = ac;
    }

    public Team() {
    }

    public List<Team> sortTeam(List<Team> t) {
        return t;
    }

    public String getTeamString() {
        return "(" + teamNumber + "," + teamAccept + ")" + teamRank;
    }

    public void setRank(int rank) {
        this.teamRank = rank;
    }

    public int getRank() {
        return this.teamRank;
    }

    public int getAccept() {
        return this.teamAccept;
    }

    public int getTeamNum() {
        return this.teamNumber;
    }

    public int compare(Team o1, Team o2) {
        int team1 = o1.teamAccept;
        int team2 = o2.teamAccept;
        if (team1 > team2) {
            return -1;
        } else if (team1 == team2) {
            return 0;
        } else {
            return 1;
        }
    }
}