import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
			if(flag && k >= 1) {
				set.add(k);
			}
		}
		int cnt = 0;
		int a[] = new int[3];
		List<int[]> list = new ArrayList<int[]>();
		for(int i : set) {
			Map<Integer, ArrayList<int[]>> map = mlist.get(0);
			for(int j = 0; j < map.get(i).size(); j++) {
				int[]p = map.get(i).get(j);
				int cx = p[0];
				int cy = p[1];
				//System.out.println(cx + " " + cy);
				boolean flag = true;
				for(int k = 0; k < N; k++) {
					int H = Math.max(0, i - Math.abs(x[k] - cx) - Math.abs(y[k] - cy));
					if(H != h[k]) {
						flag = false;
					}
				}
				if(flag) {
					if(i >= 1) {
						cnt++;
						a[0] = cx;a[1] = cy;a[2] = i;
						int[]t = {cx, cy, i};
						list.add(t);
					}
					//System.out.println(cx + " " + cy + " " + i);
				}
			}
		}
		if(cnt == 1) {
			System.out.println(a[0] +" " + a[1] + " " + a[2]);
		}else {
			for(int i = 0; i < list.size(); i++) {
				boolean flag = true;
				int[]p= list.get(i);
				int cx = p[0];
				int cy = p[1];
				int H = p[2];
				for(int j = 0; j < N; j++) {
					int t = Math.max(0, H - Math.abs(x[j] - cx) - Math.abs(y[j] - cy));
					if(t != h[j] && H <= 0) {
						flag = false;
					}
				}
				if(flag) {
					System.out.println(cx + " " + cy + " " + H);
				}
			}
		}
	}
}