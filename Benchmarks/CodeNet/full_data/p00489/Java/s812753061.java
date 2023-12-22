import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Team[] team = new Team[n];
		Team[] originArray = new Team[n];
		for(int i = 0; i < n; i++){
			team[i] = new Team(i+1);
			originArray[i] = team[i];
		}

		while(true){
			String str = br.readLine();

			if(str == null){
				break;
			}

			String[] tmpArray = str.split(" ");

			int teamA = Integer.parseInt(tmpArray[0]) - 1;
			int teamB = Integer.parseInt(tmpArray[1]) - 1;
			int scoreA = Integer.parseInt(tmpArray[2]);
			int scoreB = Integer.parseInt(tmpArray[3]);

			if(scoreA > scoreB){
				team[teamA].score += 3;
			}
			else if(scoreA == scoreB){
				team[teamA].score++;
				team[teamB].score++;
			}
			else {
				team[teamB].score += 3;
			}
		}
		
		Arrays.sort(team);
		
		team[0].rank = 1;
		for(int i = 1; i < n ; i++){
			//System.out.println(team[i].id+" "+team[i].score);
			if(team[i - 1].score != team[i].score){
				team[i].rank = i + 1;
			}
			else {
				team[i].rank = team[i-1].rank;
			}
		}

		for(int i = 0; i < n; i++){
			System.out.println(originArray[i].rank);
		}

	}

}

class Team implements Comparable<Team>{
	int id;
	int score;
	int rank;

	public Team(int id){
		this.id = id;
		score = 0;
		rank = 0;
	}

	@Override
	public int compareTo(Team o) {
		// TODO ?????????????????????????????????????????????
		if(this.score > o.score){
			return -1;
		}
		else if(this.score == o.score){
			return 0;
		}
		else {
			return 1;
		}
	}
}