import java.util.*;

public class Main {
	static class Plane {
		int X, Y;

		public Plane(int x, int y) {
			X = x;
			Y = y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<ArrayList<Plane>> p = new ArrayList<>();
		for(int i=0; i<4; i++)
			p.add(new ArrayList<>());
		
		for(int i=0; i<N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			char U = sc.next().toCharArray()[0];
			p.get("URDL".indexOf(U)).add(new Plane(X, Y));
		}
		
		int ans = Integer.MAX_VALUE;
		
		ans = Math.min(ans, f2f(p.get(0), p.get(2), true));
		ans = Math.min(ans, f2f(p.get(1), p.get(3), false));

		ans = Math.min(ans, f2s(p.get(0), p.get(1)));

		for(Plane plane : p.get(0)) {
			plane.X = -plane.X;
		}
		for(Plane plane : p.get(3)) {
			plane.X = -plane.X;
		}
		ans = Math.min(ans, f2s(p.get(0), p.get(3)));

		for(Plane plane : p.get(2)) {
			plane.Y = -plane.Y;
		}
		for(Plane plane : p.get(1)) {
			plane.Y = -plane.Y;
		}
		ans = Math.min(ans, f2s(p.get(2), p.get(1)));

		for(Plane plane : p.get(2)) {
			plane.X = -plane.X;
		}
		for(Plane plane : p.get(3)) {
			plane.Y = -plane.Y;
		}
		ans = Math.min(ans, f2s(p.get(2), p.get(3)));

		System.out.println(ans < Integer.MAX_VALUE ? ans : "SAFE");
		sc.close();
	}
	
	static int f2f(ArrayList<Plane> p1, ArrayList<Plane> p2, boolean p2Y) {
		int ans = Integer.MAX_VALUE;
		
		HashMap<Integer, ArrayList<Integer>> map2 = new HashMap<>();
		for(Plane p : p2) {
			ArrayList<Integer> list = map2.get(p2Y ? p.X : p.Y);
			if(list==null)
				list = new ArrayList<>();
			list.add(p2Y ? p.Y : p.X);
			map2.put(p2Y ? p.X : p.Y, list);
		}
		for(Integer x : map2.keySet()) {
			Collections.sort(map2.get(x));
		}
		
		HashMap<Integer, ArrayList<Integer>> map1 = new HashMap<>();
		for(Plane p : p1) {
			ArrayList<Integer> list = map1.get(p2Y ? p.X : p.Y);
			if(list==null)
				list = new ArrayList<>();
			list.add(p2Y ? p.Y : p.X);
			map1.put(p2Y ? p.X : p.Y, list);
		}
		
		for(Integer x : map1.keySet()) {
			if(map2.containsKey(x)) {
				for(Integer y : map1.get(x)) {
					int index = -Collections.binarySearch(map2.get(x), y)-1;
					if(index < map2.get(x).size()) {
						ans = Math.min(ans, (map2.get(x).get(index)-y)*5);
					}
				}
			}
		}
		
		return ans;
	}
	
	static int f2s(ArrayList<Plane> p1, ArrayList<Plane> p2) {
		int ans = Integer.MAX_VALUE;
		
		HashMap<Integer, ArrayList<Integer>> map2 = new HashMap<>();
		for(Plane p : p2) {
			ArrayList<Integer> list = map2.get(p.X+p.Y);
			if(list==null)
				list = new ArrayList<>();
			list.add(p.Y);
			map2.put(p.X+p.Y, list);
		}
		for(Integer x : map2.keySet()) {
			Collections.sort(map2.get(x));
		}
		
		HashMap<Integer, ArrayList<Integer>> map1 = new HashMap<>();
		for(Plane p : p1) {
			ArrayList<Integer> list = map1.get(p.X+p.Y);
			if(list==null)
				list = new ArrayList<>();
			list.add(p.Y);
			map1.put(p.X+p.Y, list);
		}
		
		for(Integer x : map1.keySet()) {
			if(map2.containsKey(x)) {
				for(Integer y : map1.get(x)) {
					int index = -Collections.binarySearch(map2.get(x), y)-1;
					if(index < map2.get(x).size()) {
						ans = Math.min(ans, (map2.get(x).get(index)-y)*10);
					}
				}
			}
		}
		
		return ans;
	}

}
