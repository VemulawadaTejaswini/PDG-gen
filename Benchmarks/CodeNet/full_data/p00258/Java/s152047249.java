import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int c = sc.nextInt();
			if(n==0 && c==0) break;
			int[][] map = new int[n][16];
			int[][] input = new int[c][16];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<16;j++){
					map[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<c;i++){
				for(int j=0;j<16;j++){
					input[i][j] = sc.nextInt();
				}
			}
			
			int sum = 0;
			int ans = 0;
			for(int i=0;i<n;i++){
				int max = -1;
				int id = -1;
				for(int j=0;j<c;j++){
					sum = 0;
					for(int k=0;k<16;k++){
						if(map[i][k]==1 && input[j][k]==1) sum++;
					}
					if(sum>max){
						max = sum;
						id = j;
					}
				}
				ans += max;
				if(i<n-1){
					for(int j=0;j<16;j++){
						if(input[id][j]==1 && map[i][j]==1){
							map[i][j] = 0;
						}
					}
					for(int j=0;j<16;j++){
						map[i+1][j] = Math.max(map[i][j], map[i+1][j]);
					}
				}
			}			
			System.out.println(ans);
		}
	}	
}