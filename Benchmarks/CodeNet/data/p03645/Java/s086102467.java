import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String n_m = s.nextLine();
		String[] conditions = n_m.split("\\s");
		int n = Integer.parseInt(conditions[0]);
		int m = Integer.parseInt(conditions[1]);
		
		int[] from = new int[m];
		int[] to = new int[m];
		String ship;
		String[] from_to;
		for(int i = 0; i < m; i++) {
			ship = s.nextLine();
			from_to = ship.split("\\s");
			from[i] = Integer.parseInt(from_to[0]);
			to[i] = Integer.parseInt(from_to[1]);
		}
		
		Set<Integer> transits = new HashSet<>();
		for(int i = 0; i < m; i++) {
			if(from[i] == 1) {
				transits.add(to[i]);
			}
		}
		
		boolean possible = false;
		
		for(int i = 0; i < m; i++) {
			for(Integer transit : transits) {
				if(from[i] == transit) {
					if(to[i] == n) {
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