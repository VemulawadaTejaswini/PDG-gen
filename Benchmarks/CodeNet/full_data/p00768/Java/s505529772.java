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
			int time = Integer.parseInt(tmpArray[0]);
			int teamNum = Integer.parseInt(tmpArray[1]);
			int probNum = Integer.parseInt(tmpArray[2]);
			int recNum = Integer.parseInt(tmpArray[3]);
			
			if(time == 0){
				break;
			}
			
			String[] records = new String[recNum];
			for(int i = 0; i < recNum; i++){
				records[i] = br.readLine();
			}
			
			solve(time, teamNum, probNum, records);
		}
		
	}
	
	static void solve(int time, int teamNum, int probNum, String[] records){
		Team[] teams = new Team[teamNum];
		
		for(int i = 0; i < teamNum; i++){
			teams[i] = new Team(i + 1, probNum);
		}
		
		for(int i = 0; i < records.length ; i++){
			String[] tmpArray = records[i].split(" ");
			int m = Integer.parseInt(tmpArray[0]);
			int t = Integer.parseInt(tmpArray[1]) - 1;
			int p = Integer.parseInt(tmpArray[2]);
			
			if(tmpArray[3].equals("0")){
				teams[t].AC(p, m);
			}
			else {
				teams[t].WA(p);
			}
		}
		
		//debug
//		for(int i = 0; i < teams.length ; i++){
//			System.out.println(teams[i].toString());
//		}
		Arrays.sort(teams);
		System.out.print(teams[0].id);
		for(int i = 1; i < teams.length ; i++){
			if(teams[i-1].equals(teams[i])){
				System.out.print("=");
			}
			else {
				System.out.print(",");
			}
			System.out.print(teams[i].id);
		}
		System.out.println();
		
	}

}

class Team implements Comparable<Team>{
	int id;
	boolean[] ac;
	int numOfAC;
	int time;
	int[] wa;
	
	public Team(int id, int probNum) {
		this.id = id;
		this.ac = new boolean[probNum + 1];
		this.time = 0;
		this.numOfAC = 0;
		this.wa = new int[probNum + 1];
	}
	
	public void AC(int pid, int time){
		ac[pid] = true;
		numOfAC++;
		this.time += time + 20*wa[pid];
	}
	
	public void WA(int pid){
		wa[pid]++;
	}

	@Override
	//AC??°????????§???????????????????????£??????????????§?????????
	//?????????????????????id??§??????
	public int compareTo(Team t) {
		return this.numOfAC == t.numOfAC ?
				(this.time == t.time ? t.id - this.id : this.time - t.time) :
					t.numOfAC - this.numOfAC;
	}
	
	public boolean equals(Team t) {
		return this.numOfAC == t.numOfAC && this.time == t.time;
	}
	
	public String toString(){
		return "ID "+id+"AC "+numOfAC+" time "+time;
	}
}