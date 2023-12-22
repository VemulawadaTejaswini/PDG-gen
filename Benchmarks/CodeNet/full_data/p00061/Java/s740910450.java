import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main{
	
	static Comparator<Team> c = new Comparator<Team>() {
		public int compare(Team t1, Team t2){
			if(t1.accepted > t2.accepted) return -1;
			else if(t1.accepted == t2.accepted) return 0;
			else return 1;
		}};
	
	public static void main(String[] args){
		List<Team> list = new ArrayList<Team>();
		Map<Integer, Team> lmap = new HashMap<Integer, Team>();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			Team t = new Team(str);
			if(t.number == 0 && t.accepted == 0) break;
			else{
				list.add(t);
				lmap.put(t.number, t);
			}
		}
		
		Collections.sort(list, c);
		while(sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());
			int rank = findFirst(list, lmap.get(n).accepted);
			System.out.println(rank+1);
		}
		sc.close();
	}
	
	static int findFirst(List<Team> list, int ac) {
		int i;
		for(i = 0; i < list.size(); i++) {
			if(list.get(i).accepted <= ac) break;
		}
		return i;
	}
}

class Team{
	int number;
	int accepted;

	Team(String str){
		Scanner sc = new Scanner(str);
		sc.useDelimiter(",");
		this.number = sc.nextInt();
		this.accepted = sc.nextInt();
		sc.close();
	}
}