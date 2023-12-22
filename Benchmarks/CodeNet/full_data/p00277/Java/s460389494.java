import java.util.*;
public class Main {
	static String[][] map;
	static boolean[][] al;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeMap<Team,Integer> map = new TreeMap<Team,Integer>(new MyComparator());
		int n = stdIn.nextInt();
		int r = stdIn.nextInt();
		int l = stdIn.nextInt();
		
		int time = 0;
		
		for(int i = 0; i < n; i++) {
			map.put(new Team(i+1,0), 0);
		}
		for(int i = 0; i <= n; i++) {
			list.add(0);
		}
		for(int i = 0; i< r; i++) {
			int d = stdIn.nextInt();
			int t = stdIn.nextInt();
			int x = stdIn.nextInt();
			Team tmp = map.firstKey();
			int CC = map.get(tmp);
			map.remove(tmp);
			map.put(tmp,CC + t - time);
			Team tmp2 = new Team(d,list.get(d));
			map.remove(tmp2);
			tmp2.point += x;
			list.set(d, tmp2.point);
			map.put(tmp2, list.get(d));
			
			
			
			time = t;
			if(i % 50000 == 0) {
				System.gc();
			}
		}
		Team tmp = map.firstKey();
		map.put(tmp,l-time);
		
		int max = -10;
		int id = 0;
		for(int i = 1; i <= n; i++) {
			int tmpCX;
			if(map.get(new Team(i,list.get(i))) == null) {
				tmpCX = 0;
			}
			else {tmpCX = map.get(new Team(i,list.get(i)));
			}
			if(max < tmpCX) {
				max = tmpCX;
				id = i;
			}
		}
		System.out.println(id);
	}
	
	
}

class Team {
	public int number;
	public int point;
	public Team(int number, int point) {
		this.number = number;
		this.point  = point;
	}
}

class MyComparator implements Comparator<Team> {

	public int compare(Team o1, Team o2) {
		if(o1.point < o2.point) {
			return 1;
		}
		else if(o1.point > o2.point) {
			return -1;
		}
		else if(o1.number < o2.number) {
			return -1;
		}
		else if(o2.number > o2.number) {
			return 1;
		}
		return 0;
	}

	
}