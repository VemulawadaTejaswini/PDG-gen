import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			calc(h,w);
			
		}
	}
	HashMap<String, int[]> hash;
	String[] stringlist;
	String[][] map;
	
	public void calc(int h, int w){
		hash = new HashMap<String, int[]>();
		stringlist = new String[7];
		map = new String[h][w];
		int count = 0;
		for(int i = 0; i < h; i++){
			String line = sc.next();
			for(int j = 0; j < w; j++){
				String now = line.substring(j, j+1);
				map[i][j] = now;
				if(!now.equals(".")){
					if(!hash.containsKey(now)) {
						hash.put(now, new int[]{i, j, i, j});
						stringlist[count] = now;
						count++;
					}
					else{
						int[] ele = hash.get(now);
						if(ele[0] > i) ele[0] = i;
						if(ele[1] < j) ele[1] = j;
						if(ele[2] < i) ele[2] = i;
						if(ele[3] > j) ele[3] = j;
					}
				}
			}
		}
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < count; i++){
			list.add(stringlist[i]);
		}
		boolean ans = check(count, list);
		
		if(ans) System.out.println("SAFE");
		else System.out.println("SUSPICIOUS");
	}
	public boolean check(int count, ArrayList<String> list){
		if(list.size() == 0) return true;
		else{
			for(int k = 0; k < count; k++){
				String now = list.get(k);
				int[] ele = hash.get(now);
				boolean ans = true;
				for(int i = ele[0]; i <= ele[2]; i++){
					for(int j = ele[3]; j <= ele[1]; j++){
						if(map[i][j].equals(".")) return false;
						else if(!map[i][j].equals(now) && list.contains(map[i][j])){
							ans = false;
							break;
						}
					}
				}
				if(ans) {
					list.remove(k);
					break;
				}
			}
			if(list.size() == count) return false;
			else return check(count-1, list);
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}