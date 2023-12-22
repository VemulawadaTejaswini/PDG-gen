import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	static final int MAX_NUM_TEAMS = 100;
	static final int ID_NOT_FOUND = -1;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Team[] teams= new Team[MAX_NUM_TEAMS];
		Arrays.fill(teams, new Team(0,0));
	
		//チーム情報を取得
		int numTeams = 0;
		while(numTeams < MAX_NUM_TEAMS){
			String[] input = br.readLine().split(",");
			int id = Integer.parseInt(input[0]);
			int point = Integer.parseInt(input[1]);
			if(id == 0 && point == 0)	break;
			teams[numTeams++] = new Team(id, point);
		}
		
		judgeRank(teams, numTeams);
		
		String buf;
		while((buf = br.readLine()) != null){
			int id = Integer.parseInt(buf);
			System.out.println(getRank(teams, id));
		}
	}
	public static void judgeRank(Team[] teams, int numTeams){
		//ポイントでソート
		Arrays.sort(teams, new Comparator<Team>() {
			@Override
			public int compare(Team o1, Team o2) {
				return o2.getPoint() - o1.getPoint();
			}
		});
		//順位付け
		int rank = 1;
		teams[0].setRank(rank);
		for(int i = 1; i < numTeams; i++){
			if(teams[i - 1].getPoint() == teams[i].getPoint()){
				teams[i].setRank(rank);
			}else{
				teams[i].setRank(++rank);
			}
		}
	}
	public static int getRank(Team[] teams, int id){
		for(int i = 0; i < teams.length; i++){
			if(teams[i].getId() == id)	return teams[i].getRank();
		}
		return ID_NOT_FOUND;
	}
}

class Team{
	private int id;
	private int point;
	private int rank;
	public Team(int id, int point) {
		this.id = id;
		this.point = point;
		this.rank = 1000;
	}
	public int getId() {
		return id;
	}
	public int getPoint() {
		return point;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getRank() {
		return rank;
	}
	@Override
	public String toString(){
		return this.id + ":" + this.point + ":" + this.rank;
	}
}