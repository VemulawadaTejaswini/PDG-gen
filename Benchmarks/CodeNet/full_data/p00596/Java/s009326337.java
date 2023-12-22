import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while((line=r.readLine())!=null){
				/* input from here */
				int n = Integer.parseInt(line);
				String[] in = r.readLine().split(" ");
				boolean[][] b = new boolean[7][7];
				boolean res = false;
				for(int i=0;i<7;i++){
					Arrays.fill(b[i], false);
				}
				for(String s : in){
					b[Integer.parseInt(s.substring(0,1))][Integer.parseInt(s.substring(1))] = true;
				}
				int count = in.length;
				/* input till here */

				boolean[][] temp = new boolean[7][7];        					
				for(int i=0;i<7;i++){
					for(int j=0;j<7;j++){
						temp[i][j] = b[i][j];
					}
				}
				/* processing from here */
				for(int i=0;i<7;i++){
					for(int j=i;j<7;j++){
						if(b[i][j]){
							System.out.println("start: " + i + " " + j);
							res = solve(temp,i,j,count,1);
							break;
						}
					}
					if(res){
						break;
					}
				}
				/* processing till here */
				/* output */
				if(res){
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean solve(boolean[][] b, int sr,int sc, int count,int open){
		boolean res = false;
		//System.out.println("current: " + sr + " " + sc + " count:" + count);
		if(count==1){
			return true;
		} else {			
			boolean[][] temp = new boolean[7][7]; 
			for(int i=0;i<7;i++){
				for(int j=0;j<7;j++){
					temp[i][j] = b[i][j];
				}
			}
			if(open<2){
				for(int column=0;column<7;column++){
					if(column==sc){
						continue;
					}
					if(b[sr][column]){
						temp[sr][sc] = false;
						res = solve(temp,sr,column,count-1,2);
					}
					if(res){
						break;
					}
				}
			}
			if(open>0){
				for(int row=0;row<7;row++){
					if(res){
						break;
					}
					if(row==sr){
						continue;
					}
					if(b[row][sc]){
						temp[sr][sc] = false;
						res = solve(temp,row,sc,count-1,0);
					}
				}
			}
			if(res){
				return true;
			} else {
				return false;
			}
		}
	}
}