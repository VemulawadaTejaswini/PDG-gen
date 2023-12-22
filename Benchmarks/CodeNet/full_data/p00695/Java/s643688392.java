import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int z=0;z<n;z++){
			int[][] map = new int[5][5];
			
			int wid, p;
			int max = 0;
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					wid = 8;
					p = sc.nextInt();
					if(p==1){
						if(j==0) map[i][j]=1;
						else map[i][j] = map[i][j-1]+1;
						for(int k=i;k>=0;k--){
							if(map[k][j]==0) break;
							wid = Math.min(wid, map[k][j]);
							max = Math.max(max, wid*(i+1-k));
						}
					}
				}
			}
			System.out.println(max);
		}	
	}	
}