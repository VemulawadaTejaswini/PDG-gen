import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n, team1, team2, score1, score2;
		n = sc.nextInt();
		int [] Team = new int[n+1];
		int [] Rank = new int[n+1];
		for(i = 0; i < n * (n - 1) / 2; i++){
			team1 = sc.nextInt();
			team2 = sc.nextInt();
			score1 = sc.nextInt();
			score2 = sc.nextInt();
			if(score1 > score2){
				Team[team1] = Team[team1] + 3;
			}else if(score1 == score2){
				Team[team1] = Team[team1] + 1;
				Team[team2] = Team[team2] + 1;
			}else{
				Team[team2] = Team[team2] + 3;
			}
		}
		for(i = 1; i < n + 1; i++){
			Rank[i] = 1;
			for (j = 1; j < n + 1; j++) {
				if (Team[i] < Team[j]) {
				Rank[i]++;
				}
			}
			System.out.println(Rank[i]);
		}
	}
}