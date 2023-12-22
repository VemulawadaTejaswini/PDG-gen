/* Sport Meet */
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			int n = Integer.parseInt(line);
			if(n==0) break;
			Team[] teams = new Team[n];
			
			for(int i=0; i<n; i++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				int id = Integer.parseInt(tmp[0]);
				int sec = 0;
				for(int j=1; j<=4; j++){
					sec += Integer.parseInt(tmp[2*j-1]) * 60 + Integer.parseInt(tmp[2*j]);
				}
				teams[i] = new Team(id, sec);
			}
			
			Arrays.sort(teams, new team_comparator());
			System.out.println(teams[0].id);
			System.out.println(teams[1].id);
			System.out.println(teams[n-2].id);			
		}
	}
}

class Team{
	int id;
	int sec;
	
	public Team(int id, int sec){
		this.id = id;
		this.sec = sec;
	}
}

class team_comparator implements Comparator<Team>{
	public int compare(Team t1, Team t2){
		return t1.sec - t2.sec;
	}
}