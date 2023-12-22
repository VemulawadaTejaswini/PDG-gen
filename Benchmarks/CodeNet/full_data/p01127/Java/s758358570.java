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
	HashMap<String, Integer> checkMap;
	String[][] map;
	
	public void calc(int h, int w){
		hash = new HashMap<String, int[]>();
		checkMap = new HashMap<String, Integer>();
		map = new String[h][w];
		for(int i = 0; i < h; i++){
			String line = sc.next();
			for(int j = 0; j < w; j++){
				String now = line.substring(j, j+1);
				map[i][j] = now;
				if(!hash.containsKey(now)) {
					hash.put(now, new int[]{i, j, i, j});
					checkMap.put(now, 0);
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
		boolean ans = true;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(!map[i][j].equals(".")){
					if(checkMap.get(map[i][j]) == 0){
						ans = check(map[i][j]);
						if(!ans) break;
					}
				}
			}
			if(!ans) break;
		}
		
		if(ans) System.out.println("SAFE");
		else System.out.println("SUSPICIOUS");
	}
	public boolean check(String now){
		checkMap.put(now, 2);
		int[] ele = hash.get(now);
		for(int i = ele[0]; i <= ele[2]; i++){
			for(int j = ele[3]; j <= ele[1]; j++){
				if(map[i][j].equals(".")) {
					checkMap.put(now, -1);
					return false;
				}
				else if(!map[i][j].equals(now)){
					if(checkMap.get(map[i][j]) == 0){
						boolean c = check(map[i][j]);
					}
					else if(checkMap.get(map[i][j]) == -1 || checkMap.get(map[i][j]) == 2){
						checkMap.put(now, -1);
						return false;
					}
				}
			}
		}
		checkMap.put(now, 1);
		return true;
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}