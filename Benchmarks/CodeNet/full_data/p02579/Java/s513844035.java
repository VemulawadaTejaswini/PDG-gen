import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int h = Integer.parseInt(st.nextToken());
 		int w = Integer.parseInt(st.nextToken());
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		int ch = Integer.parseInt(st1.nextToken())-1;
 		int dh = Integer.parseInt(st1.nextToken())-1;
 		StringTokenizer st2 = new StringTokenizer(bf.readLine());
 		int cw = Integer.parseInt(st2.nextToken())-1;
 		int dw = Integer.parseInt(st2.nextToken())-1;
 		char[][] grid = new char[h][w];
 		for(int j =0 ;j<h;j++)
 			grid[j] = bf.readLine().trim().toCharArray();
 		int[] lm = new int[h*w];
 		Arrays.fill(lm,  Integer.MAX_VALUE);
 		grid[ch][dh] = '*';
 		lm[ch*w+dh] = 0;
 		Queue<Integer> bfs = new LinkedList<Integer>();
 		bfs.add(ch*w+dh);
 		while(!bfs.isEmpty()){
 			int number = bfs.remove();
 			int row = number/w;
 			int col = number%w;
 			int count = 0;
 			if (row-1>=0 && grid[row-1][col] == '.'){
 				bfs.add(number-w);
 				grid[row-1][col] = '*';
 				lm[number-w] = Math.min(lm[number-w], lm[number]);
 				count++;
 			}
 			if (row+1<h && grid[row+1][col] == '.'){
 				bfs.add(number+w);
 				grid[row+1][col] = '*';
 				lm[number+w] = Math.min(lm[number+w], lm[number]);
 				count++;
 				
 			}
 			if (col+1<w && grid[row][col+1] == '.'){
 				bfs.add(number+1);
 				grid[row][col+1] = '*';
 				lm[number+1] = Math.min(lm[number+1], lm[number]);
 				count++;
 			}
 			if (col-1>=0 && grid[row][col-1] == '.'){
 				bfs.add(number-1);
 				grid[row][col-1] = '*';
 				lm[number-1] = Math.min(lm[number-1], lm[number]);
 				count++;
 			}
 			
 			if (count == 0){
 				for(int j = row-2;j<=row+2;j++){
 					for(int k = col-2;k<=col+2;k++){
 						if (Math.abs(j-row) + Math.abs(k-col) > 1 && j >=0 && j < h && k >=0 && k < w && grid[j][k] == '.'){
 							bfs.add(j*w+k);
 							grid[j][k] = '*';
 							lm[j*w+k] = Math.min(lm[j*w+k], lm[number]+1);
 						}
 					}
 				}
 			}
 			
 			
 		}
 		if (lm[cw*w+dw] == Integer.MAX_VALUE)
 			out.println(-1);
 		else
 			out.println(lm[cw*w+dw]);
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


