import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int h = 5*n+10;
			int[][] map = new int[h][5];
			int d, p, q, max, cnt;
			for(int i=0;i<n;i++){
				d = sc.nextInt();
				p = sc.nextInt();
				q = sc.nextInt() - 1; 
				
				if(d==1){
					max = -1;
					for(int j=q;j<q+p;j++){
						cnt = h-1;
						while(map[cnt][j]==0){
							cnt--;
							if(cnt==-1) break;
						}
						max = Math.max(max, cnt);
					}
					for(int j=q;j<q+p;j++) map[max+1][j] = 1;
				}else{
					cnt = h-1;
					while(map[cnt][q]==0){
						cnt--;
						if(cnt==-1) break;
					}
					for(int j=cnt+1;j<cnt+1+p;j++) map[j][q] = 1;
				}
				
				cnt = 0;
				for(int j=0;j<h;j++){
					if(map[j][0]==1 && map[j][1]==1 && map[j][2]==1 && map[j][3]==1 && map[j][4]==1) continue;
					map[cnt] = map[j];
					cnt++;
				}
			}
			
			int sum = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<5;j++){
					sum += map[i][j];
				}
			}
			System.out.println(sum);
		}	
	}	
}