import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[][] map = new int[n][2];
			for(int i=0;i<n;i++) map[i][0] = sc.nextInt();
			for(int i=0;i<n;i++) map[i][1] = sc.nextInt();
			
			int[] ans = new int[2];
			for(int i=0;i<2;i++){
				int x = i;
				int y = 0;
				int count = 0;
				ArrayDeque<Integer> que = new ArrayDeque<Integer>();
				
				while(true){	
					if(que.contains(x*1000+y)==true){
						ans[i] = -1;
						break;
					}
					if(y==n-1){
						ans[i] = count;
						break;
					}
					
					que.push(x*1000+y);
					if(y<n-1 && map[y][x]==1 && map[y+1][x]==1){
						y++;
					}else if(map[y][x]==2){
						y--;
					}else{
						if(x==0) x=1;
						else if(x==1) x=0;
						if(y==n-2) y+=1;
						else y+=2;
						
						count++;
					}
				}
			}
			if(ans[0]==-1 && ans[1]==-1) System.out.println("NA");
			else if(ans[0]==-1) System.out.println(ans[1]);
			else if(ans[1]==-1) System.out.println(ans[0]);
			else if(ans[0]>ans[1]) System.out.println(ans[1]);
			else System.out.println(ans[0]);
		}
	}	
}