import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		RankManager manager = new RankManager();
		
		while(true){
			String[] tmparray = br.readLine().split(",");
			int id = Integer.parseInt(tmparray[0]);
			int score = Integer.parseInt(tmparray[1]);
			
			if(id == 0 && score == 0){
				break;
			}
			
			manager.addTeam(id, score);
		}
		
		manager.decideRank();
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			System.out.println(manager.getRank(Integer.parseInt(str)));
		}
	}

}

class RankManager {
	ArrayList<Team> teams = new ArrayList<Team>();

	public void addTeam(int id, int score){
		teams.add(new Team(id, score));
	}

	private void sort(){
		Collections.sort(teams, new Comparator<Team>(){
			public int compare(Team t1, Team t2){
				if(t1.score < t2.score){
					return 1;
				}
				else if(t1.score > t2.score){
					return -1;
				}
				else{
					return 0;
				}
			}
		});
	}

	public void decideRank(){
		this.sort();

		int rank = 1;
		teams.get(0).rank = 1;
		int currentScore = teams.get(0).score;
		for(int i = 1; i < teams.size() ; i++){
			if(teams.get(i).score != currentScore){
				rank++;
				teams.get(i).rank = rank;
				currentScore = teams.get(i).score;
			}
			else {
				teams.get(i).rank = rank;
			}
		}
	}

	public int getRank(int id){
		for(int i = 0 ; i < teams.size(); i++){
			if(teams.get(i).ID == id){
				return teams.get(i).rank;
			}
		}
		
		return -1;
	}
}

class Team {
	int ID;
	int score;
	int rank;

	public Team(int ID, int score){
		this.ID = ID;
		this.score = score;
	}
}