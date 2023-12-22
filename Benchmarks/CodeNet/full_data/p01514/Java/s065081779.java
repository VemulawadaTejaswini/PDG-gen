import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int numOfTeam = Integer.parseInt(tmpArray[0]);
			int numOfProblem = Integer.parseInt(tmpArray[1]);
			int numOfRecord = Integer.parseInt(tmpArray[2]);
			
			if(numOfTeam == 0 && numOfProblem == 0 && numOfRecord == 0){
				break;
			}
			
			Team[] teams = new Team[numOfTeam];
			for(int i = 0; i < numOfTeam ; i++){
				teams[i] = new Team(i + 1, numOfProblem);
			}
			
			for(int i = 0; i < numOfRecord ; i++){
				tmpArray = br.readLine().split(" ");
				int tmpid = Integer.parseInt(tmpArray[0]) - 1;
				int tmppid = Integer.parseInt(tmpArray[1]);
				int tmptime = Integer.parseInt(tmpArray[2]);
				
				if(tmpArray[3].equals("CORRECT")){
					teams[tmpid].solve(tmppid, tmptime);
				}
				else {
					teams[tmpid].addPenalty(tmppid);
				}
			}
			
			Arrays.sort(teams);
			
			for(int i = 0; i < numOfTeam ; i++){
				System.out.println(teams[i].id +" "+teams[i].solved + " "+ teams[i].penalty);
			}
		}
	}

}

class Team implements Comparable<Team> {
	int id;
	int solved;
	int[] mistake;
	int penalty;
	
	public Team(int id, int numOfP){
		this.id = id;
		mistake = new int[numOfP + 1];
	}
	
	public void addPenalty(int pid){
		mistake[pid]++;
	}
	
	public void solve(int pid, int time){
		solved++;
		penalty += mistake[pid]*1200 + time;
	}

	@Override
	public int compareTo(Team t) {
		// TODO Auto-generated method stub
		return this.solved == t.solved ? 
				(this.penalty == t.penalty ? (this.id == t.id ? 0 : this.id - t.id) : this.penalty - t.penalty) : t.solved - this.solved;
	}
	
	
}