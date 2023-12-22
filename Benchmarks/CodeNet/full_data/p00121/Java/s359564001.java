
import java.io.*;
import java.util.*;

public class Main{
	static HashMap<Integer, Integer> done;
	static LinkedList<int[][]> pats;
	static int Goal = 1234567;
	static int ans;
	static final int[] dx = {1,0,-1,0};
	static final int[] dy = {0,1,0,-1};
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		String str;
		while((str = br.readLine()) != null){
			if(str.equals("")) break;
			pats = new LinkedList<int[][]>();
			done = new HashMap<Integer, Integer>();
			String input[] = str.split(" +");
			int nana[][] = new int[2][4];
			int id = 0;
			
			for(int x = 0; x < 2; x++)
				for(int y = 0; y < 4; y++)
					nana[x][y] = new Integer(input[id++]);
			
			pats.add(nana);
			done.put(toNum(nana), 0);
			
			while(!pats.isEmpty()){
				
				int[][] pattern = pats.poll();

				int A = toNum(pattern);
				if(A == Goal){
					ans = done.get(A);
					break;
				}
				
				int sx = -1, sy = -1;
				id = 0;
				for(int p = 0; p < 2; p++)
					for(int q = 0; q < 4; q++)
						if(pattern[p][q] == 0){
							sy = p;
							sx = q;
						}
				
				for(int i = 0; i < 4; i++){
					if(sx+dx[i]<0 | sx+dx[i]>=4) continue;
					if(sy+dy[i]<0 | sy+dy[i]>=2) continue;
					pattern[sy][sx] = pattern[sy+dy[i]][sx+dx[i]];
					pattern[sy+dy[i]][sx+dx[i]] = 0;
					
					int num = toNum(pattern);
					if(!done.containsKey(num)){
						done.put(num, done.get(A)+1);
						pats.add(FullClone(pattern));
					}
					pattern[sy+dy[i]][sx+dx[i]] = pattern[sy][sx];
					pattern[sy][sx] = 0;
				}
			}
			System.out.println(ans);
		}
	}
	
	private static int[][] FullClone(int[][] pattern) {
		int[][] cl = new int[2][4];
		for(int p = 0; p < 2; p++)
			for(int q = 0; q < 4; q++)
				cl[p][q] = pattern[p][q];
		return cl;
	}

	static int toNum(int str[][]){
		String s = "";
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 4; j++)
				s += str[i][j]+"";
		return new Integer(s);
	}
}