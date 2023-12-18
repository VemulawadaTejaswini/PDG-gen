import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private class City {
		int no;
		int connectedCount = 0;
		List<Integer> connected = new ArrayList<Integer>();
		boolean visited = false;
		List<City> roads = new ArrayList<City>();
		List<City> rails = new ArrayList<City>();
		
		public City(int no) {
			this.no = no;
		}
		
		public void visitRoads(List<Integer> connectedList) {
			if(visited) return;
			
			this.visited = true;
			connectedList.add(this.no);
			for(City next: roads) {
				next.visitRoads(connectedList);
			}
		}
		
		public int visitRails(List<Integer> connectedList, int count) {
			if(visited) return count;
			
			int result = count;
			this.visited = true;
			int index = connectedList.indexOf(this.no); 
			if(index != -1) {
				result = result + 1;
				connectedList.remove(index);
			}
			for(City next: rails) {
				result = next.visitRails(connectedList, result);
			}
			return result;
		}
	}
	
	private void reset(City[] cities) {
		for(City city : cities) {
			city.visited = false;
		}
	}
	
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		
		City[] cities = new City[n];
		for(int i=0; i<n; i++) {
			cities[i] = new City(i);
		}
		
		for(int i=0; i<k; i++) {
			int p1 = sc.nextInt() - 1;
			int q1 = sc.nextInt() - 1;
			cities[p1].roads.add(cities[q1]);
			cities[q1].roads.add(cities[p1]);
		}
		
		for(int i=0; i<l; i++) {
			int r1 = sc.nextInt() - 1;
			int s1 = sc.nextInt() - 1;
			cities[r1].rails.add(cities[s1]);
			cities[s1].rails.add(cities[r1]);
		}
		
		for(City city : cities) {
			city.visitRoads(city.connected);
			reset(cities);
		}
		for(City city : cities) {
			city.connectedCount = city.visitRails(city.connected, city.connectedCount);
			reset(cities);
		}
		
		StringBuilder answer = new StringBuilder();
		for(City city : cities) {
			answer.append(city.connectedCount);
			answer.append(" ");
		}
		System.out.println(answer.toString());
	}
}
