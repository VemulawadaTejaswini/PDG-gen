import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String n_m = s.nextLine();
		String[] conditions = n_m.split("\\s");
		int n = Integer.parseInt(conditions[0]);
		int m = Integer.parseInt(conditions[1]);
		
		HashMap<Integer, List<Integer>> ships = new HashMap<>();
		String ship;
		String[] from_to;
		for(int i = 0; i < m; i++) {
			ship = s.nextLine();
			from_to = ship.split("\\s");
			int from = Integer.parseInt(from_to[0]);
			int to = Integer.parseInt(from_to[1]);
			
			if(ships.containsKey(from)) {
				ships.get(from).add(to);
			} else {
			ships.put(from,new ArrayList<Integer>(to));
			}
		}
		
		boolean possible = false;
		
		List<Integer> transits = ships.get(1);
		for(Integer transit : transits) {
			if(ships.containsKey(transit)) {
				List<Integer> goals = ships.get(transit);
				for(Integer goal : goals) {
					if(goal == m) {
						possible = true;
					}
				}
			}
		}
		if(possible) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}
