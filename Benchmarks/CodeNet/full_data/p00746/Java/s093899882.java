import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int[][] input = new int[n-1][2];
			int[][] map = new int[n][4];
			for(int i=0;i<n-1;++i){
				input[i][0]=sc.nextInt();
				input[i][1]=sc.nextInt();
				map[input[i][0]][input[i][1]]=i+1;
			}
			int left=0,right=0,top=0,under=0;
			Queue<Integer> queue = new LinkedList<Integer>();
			for(int j=0;j<4;++j){
				int[] count = new int[4];
				if(map[0][j]!=0){
					queue.add(map[0][j]);
					if(j==0) count[0]--;
					else if(j==1) count[1]++;
					else if(j==2) count[2]++;
					else count[3]--;
				}
				while(!queue.isEmpty()){
					int cur = queue.remove();
					for(int i=0;i<4;++i){
						if(map[cur][i]!=0){
							queue.add(map[cur][i]);
							if(i==0) count[0]--;
							else if(i==1) count[1]++;
							else if(i==2) count[2]++;
							else count[3]--;
						}
					}
					if(left>count[0]+count[2]) left=count[0]+count[2];
					if(under<count[1]+count[3]) under=count[1]+count[3];
					if(right<count[0]+count[2]) right=count[0]+count[2];
					if(top>count[1]+count[3]) top=count[1]+count[3];
				}
			}
			System.out.println((-1*left+right+1)+" "+(-1*top+under+1));
		}
	}
}

