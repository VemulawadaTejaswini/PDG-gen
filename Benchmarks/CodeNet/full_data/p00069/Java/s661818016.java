import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int s = sc.nextInt();
			int g = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] map = new int[m+1][n+1];
			
			String t;
			for(int i=1;i<=m;i++){
				t = sc.next();
				for(int j=1;j<n;j++){
					map[i][j] = t.codePointAt(j-1)-48;
				}
			}
			
			int x;
			boolean flag = false;
			for(int i=0;i<=m;i++){
				for(int j=1;j<n;j++){
					if(map[i][j-1]==0 && map[i][j]==0 && map[i][j+1]==0){
						map[i][j] = 1;
						x = s;
						for(int k=1;k<=m;k++){
							if(map[k][x-1]==1) x--;
							else if(map[k][x]==1) x++;
						}
						if(x==g){
							if(i==0) System.out.println(0);
							else System.out.println(i + " " + j);
							flag = true;
							i = m+1;
							j = n;
						}else{
							map[i][j] = 0;
						}
					}
				}
			}
			if(flag==false) System.out.println(-1);
		}	
	}	
}