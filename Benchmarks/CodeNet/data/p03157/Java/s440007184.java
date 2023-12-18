
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int h = scn.nextInt();
		int w = scn.nextInt();
		String[] str = new String[h];
		for (int i = 0; i < h; i++) {
			str[i] = scn.next();
		}
		int ans=0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int [][]visited=new int[h][w];
				int x=dfs(i,j,h,w,str[i].charAt(j),str,visited,str[i].charAt(j));
				ans+=x;
				//System.out.println(i+" "+j+" "+x);
			}
		}
		System.out.println(ans);
	}

	public static int dfs(int i, int j, int h, int w, char ch, String[] str, int[][] visited,char check) {
		visited[i][j] = 1;
		int x=0,y=0;
		if (i + 1 < h && visited[i + 1][j] == 0 && str[i + 1].charAt(j) != ch) {
			 x=dfs(i + 1, j, h, w, str[i + 1].charAt(j), str, visited,check);

				x=(str[i+1].charAt(j)!=check?x+1:x);
		}
		if (j + 1 < w && visited[i][j + 1] == 0 && str[i].charAt(j + 1) != ch) {
			
			y= dfs(i, j + 1, h, w, str[i].charAt(j + 1), str, visited,check);
			 y=(str[i].charAt(j+1)!=check?y+1:y);
		}
		return x+y;
	}
}
