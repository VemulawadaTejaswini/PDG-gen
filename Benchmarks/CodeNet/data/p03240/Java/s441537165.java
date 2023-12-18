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
					if(h[i] == 0 && i == 0) {
						continue;
					}
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
		for(int H : mlist.get(0).keySet()){
			boolean flag = true;
			for(int i = 1; i < N; i++) {
				Map<Integer, ArrayList<int[]>> map = mlist.get(i);
				if(!map.containsKey(H)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				set.add(H);
			}
		}
		int cnt = 0;
		int a[] = new int[3];
		List<int[]> list = new ArrayList<int[]>();
		for(int H : set) {
			Map<Integer, ArrayList<int[]>> map = mlist.get(0);
			for(int j = 0; j < map.get(H).size(); j++) {
				int[]p = map.get(H).get(j);
				int cx = p[0];
				int cy = p[1];
				//System.out.println(cx + " " + cy);
				boolean flag1 = true;
				for(int k = 0; k < N; k++) {
					int t = Math.max(0, H - Math.abs(x[k] - cx) - Math.abs(y[k] - cy));
					if(t != h[k]) {
						flag1 = false;
						break;
					}
				}
				if(flag1) {
					boolean flag0 = true;
					for(int k = 0; k < N; k++) {
						Map<Integer, ArrayList<int[]>> mapK = mlist.get(k);
						List<int[]> listK = mapK.get(H);
						boolean flag = false;
						for(int l = 0; l < listK.size(); l++){
							int[]pK = listK.get(l);
							if(cx == pK[0] || cy == pK[1]) {
								break;
							}
						}
						if(flag) {
							flag0 = false;
							break;
						}
					}
					if(flag0) {
						System.out.println(cx + " " + cy + " " + H);
						System.exit(0);
					}
				}
			}
		}
	}
}