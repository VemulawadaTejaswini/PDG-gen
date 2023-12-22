import java.util.*;

public class Main{
	public static int[][] solve(int[][] map, Set<List<Integer>> bomb){
		while( bomb.size() != 0 ){
			Set<List<Integer>> temp = new HashSet<List<Integer>>();
			for(List<Integer> list : bomb){
				map[list.get(1)][list.get(0)] = 0;
				int st_l = ( list.get(1)-3 < 0 ) ? 0 : list.get(1)-3;
				int fin_l = ( list.get(1)+3 > 7 ) ? 7 : list.get(1)+3;
				int st_w = ( list.get(0)-3 < 0 ) ? 0 : list.get(0)-3;
				int fin_w = ( list.get(0)+3 > 7 ) ? 7 : list.get(0)+3;
				for(int i = st_l; i <= fin_l; i++){
					if( map[i][list.get(0)] == 1 ){
						List<Integer> point = new ArrayList<Integer>();
						point.add(list.get(0)); point.add(i);
						temp.add(point);
					}
				}
				for(int i = st_w; i <= fin_w; i++){
					if( map[list.get(1)][i] == 1 ){
						List<Integer> point = new ArrayList<Integer>();
						point.add(i); point.add(list.get(1));
						temp.add(point);
					}
				
				}				
			}
			bomb.clear();
			bomb = new HashSet<List<Integer>>(temp);
		}
		return map;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<int[][]> ans = new ArrayList<int[][]>();
		int T = stdIn.nextInt();
		
		for(int i = 0; i < T; i++){
			String[] s = new String[8];
			for(int j = 0; j < 8; j++){
				s[j] = stdIn.next();
			}
			int[][] map = new int[8][8];
			for(int j = 0; j < 8; j++){
				for(int k = 0; k < 8; k++){
					map[j][k] = Integer.parseInt(Character.toString(s[j].charAt(k)));
				}
			}
			int x = stdIn.nextInt(), y = stdIn.nextInt();
			Set<List<Integer>> bomb = new HashSet<List<Integer>>();
			List<Integer> list = new ArrayList<Integer>();
			list.add(x-1); list.add(y-1);
			bomb.add(list);
			int[][] result = new int[8][8];
			result = solve(map,bomb);
			ans.add(result);
		//	System.out.println("Data " + (i+1) + ":");
		/*	for(int[] z : result){
				for(int w : z){
					System.out.print(w);
				}
				System.out.println();
			}*/
		}
		for(int i = 1; i <= T; i++){
			System.out.println("Data " + i + ":");
			for(int[] a : ans.get(i-1)){
				for(int b : a){
					System.out.print(b);
				}
				System.out.println();			
			}
		}
	}
}