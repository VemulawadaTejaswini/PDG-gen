
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()){
			int n = sc.nextInt();

			boolean[][] map = new boolean[7][7];
			int start = -1;
			boolean[] nodeFlg = new boolean[7];
			for(int i=0;i<n;i++){
				String s = sc.next();
				int from = s.charAt(0) - '0';
				int to = s.charAt(1) - '0';

				nodeFlg[from] = nodeFlg[to] = true;
				if(from != to){
					map[from][to] = map[to][from] = true;
					start = from;
				}
			}

			int nodeCount = 0;
			for(int i=0;i<7;i++) if(nodeFlg[i]) nodeCount++;

			if(start == -1){
				System.out.println(nodeCount==1 ? "Yes" : "No");
				continue;
			}

			if(reachableCount(start,map,new boolean[7]) != nodeCount){
				System.out.println("No");
				continue;
			}

			System.out.println(isEulerGraph(map,nodeCount) ? "Yes" : "No");
		}
	}

	private static int reachableCount(int from,boolean[][] map,boolean[] flg){
		int res = 1;

		flg[from] = true;
		for(int i=0;i<7;i++){
			if(map[from][i] && !flg[i]){
				res += reachableCount(i,map,flg);
			}
		}

		return res;
	}

	private static boolean isEulerGraph(boolean[][] map,int nodeCount){
		int n = map.length;
		int evenCount = 0;

		for(int i=0;i<n;i++){
			int count = 0;
			for(int j=0;j<n;j++){
				if(i != j && map[i][j]){
					count++;
				}
			}
			if(count != 0 && count % 2 == 0) evenCount++;
		}
		if(evenCount == nodeCount || evenCount == nodeCount-2) return true;
		return false;
	}
}