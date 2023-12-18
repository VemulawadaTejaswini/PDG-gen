import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		List<IslandsPair> islands = new ArrayList<>();
		for(int i=0; i<m; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			
			boolean canShare = false;
			for(IslandsPair pair : islands) {
				if(pair.canShare(a, b)) {
					canShare = true;
					pair.west = Math.max(pair.west, a);
					pair.east = Math.min(pair.east, b);
					break;
				}
			}
			if(!canShare) {
				islands.add(new IslandsPair(a, b));
			}
		}
		
		System.out.println(islands.size());
	}
	
	private class IslandsPair {
		int west;
		int east;
		
		public IslandsPair(int west, int east) {
			this.west = west;
			this.east = east;
		}
		
		public boolean canShare(int west, int east) {
			boolean contains = (this.west <= west && this.east > west) || (this.west < east && this.east >= east);
			boolean wrapped = this.west > west && this.east < east;
			
			return contains || wrapped;
		}
	}
}
