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
		islands.add(new IslandsPair(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
		for(int i=0; i<m-1; i++) {
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
			boolean eastContains = this.west >= west && this.east >= east && this.west < east;
			boolean contains = this.west <= west && this.east >= east;
			boolean westContains = this.west <= west && this.east <= east && this.east > west;
			
			return eastContains || contains || westContains;
		}
	}
}
