import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int n;
	public static char[][] s;
	public static int[][] map;
	// map[i][j]: i?????????j?????????????????¨?????????j???????§???????
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n == 0) break;
			List<String> list = new ArrayList<String>();
			for(int i=0; i<n; i++){
				list.add(in.next());
			}
			Queue<String> rm = new LinkedList<String>();
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i==j) continue;
					if(list.get(i).indexOf(list.get(j)) != -1){
						rm.add(list.get(j));
					}
				}
			}
			n -= rm.size();
			while(!rm.isEmpty()) list.remove(rm.poll());
			s = new char[n][];
			for(int i=0; i<n; i++){
				s[i] = list.get(i).toCharArray();
			}
			map = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i==j) continue;
					for(int k=0; k<s[i].length; k++){
						// ?????????j???i?????§???????§???????
						int len = Math.min(s[i].length-k, s[j].length);
						boolean ok = true;
						for(int l=0; l<len; l++){
							if(s[i][k+l] != s[j][l]){
								ok = false;
								break;
							}
						}
						if(ok){
							map[i][j] = s[i].length-k;
							break;
						}
					}
				}
			}
			int[] p = new int[n];
			minlen = 101;
			for(int i=0; i<n; i++){
				p[0] = i;
				dfs(p, 1, 1<<i, s[i].length);
			}
			int as = 0;
			int ai = 0;
			int an = s[min[as]].length;
			for(int i=0; i<minlen; i++){
				System.out.print(s[min[as]][ai]);
				ai++;
				if(i==minlen-1) break;
				if(ai == an){
					as++;
					ai = map[min[as-1]][min[as]];
					an = s[min[as]].length;
				}
			}
			System.out.println();
		}
	}
	public static int[] min;
	public static int minlen;
	public static void dfs(int[] p, int dep, int used, int len){
		if(len > minlen) return;
		if(dep == n){
			if(len < minlen || isBetter(p, min, len)){
				min = p.clone();
				minlen = len;
			}
			return;
		}
		for(int i=0; i<n; i++){
			if((used&1<<i)>0) continue;
			p[dep] = i;
			dfs(p, dep+1, used|1<<i, len+(s[i].length-map[p[dep-1]][i]));
		}
	}
	
	public static boolean isBetter(int[] a, int[] b, int len){
		// a???b???????????????????°???????????????§????????????
		int as = 0;
		int ai = 0;
		int an = s[a[as]].length;
		int bs = 0;
		int bi = 0;
		int bn = s[b[bs]].length;
		for(int i=0; i<len; i++){
			if(s[a[as]][ai] < s[b[bs]][bi]) return true;
			ai++;
			bi++;
			if(i==len) break;
			if(ai == an){
				as++;
				ai = map[a[as-1]][a[as]];
				an = s[a[as]].length;
			}
			if(bi == bn){
				bs++;
				bi = map[b[bs-1]][b[bs]];
				bn = s[b[bs]].length;
			}
		}
		return false;
	}
}