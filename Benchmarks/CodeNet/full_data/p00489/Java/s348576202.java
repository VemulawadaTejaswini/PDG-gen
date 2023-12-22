import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Team[] teams = new Team[n];
        for (int i = 0; i < n; i++) {
            teams[i] = new Team(i + 1);
        }
        for (int i = 0; i < n * (n - 1) / 2; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (c == d) {
                teams[a].point++;
                teams[b].point++;
            } else if (c > d) {
                teams[a].point += 3;
            } else {
                teams[b].point += 3;
            }
        }
        Arrays.sort(teams);
        int rank = 1;
        teams[0].rank = 1;
        for (int i = 1; i < n; i++) {
            if (teams[i].point == teams[i - 1].point) {
                teams[i].rank = rank;
            } else {
                rank = i + 1;
                teams[i].rank = rank;
            }
        }
        Arrays.sort(teams, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t1.idx - t2.idx;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Team t : teams) {
            sb.append(t.rank).append("\n");
        }
        System.out.print(sb);
    }
    
    static class Team implements Comparable<Team> {
        int idx;
        int point;
        int rank;
        
        public Team(int idx) {
            this.idx = idx;
        }
        
        public int compareTo(Team another) {
            return another.point - point;
        }
    }
}

