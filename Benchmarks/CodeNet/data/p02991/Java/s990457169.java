
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

		for (int i=1;i<=n;i++) {
			graph.put(i, new ArrayList<Integer>());
		}
		for (int i=0;i<m;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			graph.get(u).add(v);
		}

		int s = sc.nextInt();
		int t = sc.nextInt();

		HashMap<Integer, Integer> dist = new HashMap<>();


		HashSet<Integer> set = new HashSet<>();


		set.add(s);
		int i=0;
		while(!set.isEmpty()) {
			for (Integer intg : set) {
				dist.put(intg, i);
			}
			HashSet<Integer> first = new HashSet<>();
			HashSet<Integer> second = new HashSet<>();
			HashSet<Integer> third = new HashSet<>();
			for (Integer intg : set) {
				for (Integer intg2 : graph.get(intg)) {
					first.add(intg2);
				}
			}
			for (Integer intg2 : first) {
				for (Integer intg3 : graph.get(intg2)) {
					second.add(intg3);
				}
			}
			for (Integer intg3 : second) {
				for (Integer intg4 : graph.get(intg3)) {
					if (!dist.containsKey(intg4)) {
						third.add(intg4);
					}
				}
			}

			set=third;
			i++;
		}

		System.out.println(dist.containsKey(t) ? dist.get(t) : -1);
	}






}