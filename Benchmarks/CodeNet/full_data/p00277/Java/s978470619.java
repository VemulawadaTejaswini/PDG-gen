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
		int dx = 0;
		int dd = 0;
		for(int i = 0; i< r; i++) {
			int d = stdIn.nextInt();
			int t = stdIn.nextInt();
			int x = stdIn.nextInt();
			dx = x;
			dd = d;
			Team tmp = map.firstKey();
			
			map.put(tmp,map.get(tmp) + t - time);
			Team tmp2 = new Team(d,list.get(d));
			map.remove(tmp2);
			tmp2.point += x;
			
			map.put(tmp2, list.get(d));
			list.set(d, tmp2.point);
			
			
			time = t;
			if(i % 50000 == 0) {
				System.gc();
			}
		}
		Team tmp = map.firstKey();
		map.put(tmp,l-time);
		
		int max = 0;
		boolean tt = false;
		int id = 0;
		for(int i = 1; i < list.size(); i++) {
			int tmpCX;
			if(map.get(new Team(i,list.get(i))) != null) {
				tmpCX = map.get(new Team(i,list.get(i)));

			}
			else {
				tmpCX = 0;
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
		if(o1.number == o2.number) {
			return 0;
		}
		
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