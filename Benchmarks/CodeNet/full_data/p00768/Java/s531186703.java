

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		List<Team> team_list = new ArrayList<Team>();
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(), T = sc.nextInt(), P = sc.nextInt(), R = sc.nextInt();
		for(int i = 0; i < T; i++) {
			Team team = new Team();
			team.setId(i);
			team_list.add(team);
		}
		
		for(int i = 0; i< R; i++) {
			int mk = sc.nextInt(), tk = sc.nextInt(), pk = sc.nextInt(), jk = sc.nextInt();
			
			if(jk == 0) {
				team_list.get(tk-1).addCount();
				team_list.get(tk-1).addTime(mk);
				if(team_list.get(tk-1).getMisCount() > 0) {
					for(int j = 0; j < team_list.get(tk-1).getMisCount(); j++) {
						team_list.get(tk-1).addTime(20);
						team_list.get(tk-1).setMisCount(0);
					}
				}
			}
		}
		
		for(int i = 0; i < T-1;i++) {
			for(int j =i+1; j < T; j++) {
				if(team_list.get(i).getCount() < team_list.get(j).getCount()) {
					Team team_tmp = team_list.get(i);
					team_list.get(j) = team_list.get(j);
					team_list.get(j) = team_tmp;
				}
			}
		}
		
	}
}


class Team{
	
	public Team() {
	  this.setCount(0);
	  this.setMisCount(0);
	  this.setTime(0);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void addCount() {
		this.count++;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void addTime(int time) {
		this.time += time;
	}
	public int getMisCount() {
		return misCount;
	}
	public void setMisCount(int misCount) {
		this.misCount = misCount;
	}
	private int id;
	private int count;
	private int time;
	private int misCount;
}
