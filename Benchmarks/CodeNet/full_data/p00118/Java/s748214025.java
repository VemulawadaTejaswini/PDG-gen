import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int h,w;
	static int[] v1={0,1,0,-1};
	static int[] v2={1,0,-1,0};
	static int[][] field;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			h = cin.nextInt();
			w = cin.nextInt();
			if(h+w==0){
				break;
			}
			field= new int[h+2][w+2];
			for(int i = 1;i<=h;i++){
				String ss = cin.next();
				char[] s = ss.toCharArray();
				for(int j = 1;j<=w;j++){
					if(s[j-1]=='@'){
						field[i][j]=1;
					}
					else if(s[j-1]=='#'){
						field[i][j]=2;
					}
					else if(s[j-1]=='*'){
						field[i][j]=3;
					}
				}
			}
			int cnt=0;
			for(int i = 1;i<=h;i++){
				for(int j = 1;j<=w;j++){
					if(field[i][j]!=0){
						cnt++;
						dfs(i,j);
					}
				}
			}
			System.out.println(cnt);
		}
	}
	static void dfs(int x,int y){
		Queue<Integer[]> q = new LinkedList<Integer[]>();
		Integer[] fwj={x,y};
		int now = field[x][y];
		q.add(fwj);
		while(!q.isEmpty()){
			Integer[] a = q.poll();
			x = a[0];
			y = a[1];
			field[x][y]=0;
			for(int i = 0;i<4;i++){
				if(field[x+v1[i]][y+v2[i]]==now){
					Integer[] next = {x+v1[i],y+v2[i]};
					q.add(next);
				}
			}
		}
	}
}