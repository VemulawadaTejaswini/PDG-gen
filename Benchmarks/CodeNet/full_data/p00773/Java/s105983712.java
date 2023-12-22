import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[100][1000];
		for(int i=1;i<100;i++){
			for(int j=0;j<1000;j++){
				int p = j*(100+i)/100;
				if(p>=1000) map[i][j] = Integer.MIN_VALUE; 
				else map[i][j] = p;
			}
		}
		
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int s = sc.nextInt();
			if(x==0 && y==0 && s==0) break;
			
			int max = 0;
			for(int i=1;i<1000;i++){
				for(int j=i;j<1000;j++){
					if(map[x][i]+map[x][j]==s) max = Math.max(max, map[y][i]+map[y][j]);
				}
			}
			System.out.println(max);
		}
	}

}