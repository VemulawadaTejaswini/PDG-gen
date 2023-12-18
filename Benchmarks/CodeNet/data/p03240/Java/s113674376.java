import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[]x = new int[N];
		int[]y = new int[N];
		int[]h = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			h[i] = scan.nextInt();
		}
		scan.close();

		ArrayList<Map<Integer, ArrayList<int[]>>> mlist = new ArrayList<Map<Integer, ArrayList<int[]>>>();
		for(int i = 0; i < N; i++) {
			Map<Integer, ArrayList<int[]>> map = new HashMap<Integer, ArrayList<int[]>>();
			for(int cx = 0; cx <= 100; cx++) {
				for(int cy = 0; cy <= 100; cy++) {
					int H = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i]- cy);
					if(H == 0 || h[i] == 0) continue;
					if(map.containsKey(H)) {
						ArrayList<int[]> list = map.get(H);
						int[]t = {cx, cy};
						list.add(t);
						map.put(H, list);
					}else {
						int[]t = {cx, cy};
						ArrayList<int[]> list = new ArrayList<int[]>();
						list.add(t);
						map.put(H, list);
					}
				}
			}
			mlist.add(map);
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int k : mlist.get(0).keySet()){
			boolean flag = true;
			for(int i = 1; i < N; i++) {
				Map<Integer, ArrayList<int[]>> map = mlist.get(i);
				if(!map.containsKey(k)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				if(k >= 1) {
					set.add(k);
				}
			}
		}
		int cnt = 0;
		int a[] = new int[3];
		Map<Integer, ArrayList<int[]>> m = new HashMap<Integer, ArrayList<int[]>>();
		for(int i : set) {
			Map<Integer, ArrayList<int[]>> map = mlist.get(0);
			for(int j = 0; j < map.get(i).size(); j++) {
				int[]p = map.get(i).get(j);
				int cx = p[0];
				int cy = p[1];
				//System.out.println(cx + " " + cy);
				boolean flag1 = true;
				for(int k = 0; k < N; k++) {
					int t = Math.max(0, i - Math.abs(x[k] - cx) - Math.abs(y[k] - cy));
					if(t != h[k]) {
						flag1 = false;
						break;
					}
				}
				if(flag1) {
					if(m.containsKey(i)) {
						int[]v = {cx, cy};
						m.get(i).add(v);
					}else {
						int[]t = {cx, cy};
						ArrayList<int[]> list = new ArrayList<int[]>();
						list.add(t);
						m.put(i, list);
					}
				}
			}
		}
		//System.out.println(m.size());
		if(m.size() == 1) {
			for(int i : m.keySet()) {
				if(m.get(i).size() == 1) {
					int[]v = {m.get(i).get(0)[0], m.get(i).get(0)[1]};
					System.out.println(v[0] + " " + v[1] + " " + i);
				}
			}
		}else {
			for(int i : m.keySet()) {
				for(int j = 0; j < m.get(i).size(); j++) {
					int[]v = {m.get(i).get(j)[0], m.get(i).get(j)[1]};
					int cx = v[0];
					int cy = v[1];
					boolean flag = true;
					for(int k = 0; k < N; k++) {
						int t = Math.min(0, i - Math.abs(x[k] - cx) - Math.abs(y[k] - cy));
						if(t != h[k]) {
							flag = false;
							break;
						}
						if(i == Math.abs(x[k] - cx) + Math.abs(y[k] - cy)) {
							flag = false;
							break;
						}
					}
					if(flag) {
						System.out.println(cx + " " + cy + i);
						System.exit(0);
					}
				}
			}
		}
	}
}