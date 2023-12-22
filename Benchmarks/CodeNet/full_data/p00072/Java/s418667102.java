import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int m = sc.nextInt();
			int[][] map = new int[m][3];
			for(int i=0;i<m;i++){
				String[] s = sc.next().split(",");
				map[i][0] = Integer.valueOf(s[0]);
				map[i][1] = Integer.valueOf(s[1]);
				map[i][2] = Integer.valueOf(s[2]) - 100;
			}
			
			Arrays.sort(map, new Comparator<int[]>(){
				public int compare(int[] o1, int[] o2) {
					return o1[2] - o2[2];
				}
			});

			boolean[][] f = new boolean[100][100];
			int sum = 0;
			for(int i=0;i<n;i++) f[i][i] = true;
			
			int p, q;
			for(int i=0;i<m;i++){
				p = map[i][0];
				q = map[i][1];
				if(f[p][q]==false){
					sum += map[i][2];
					for(int j=0;j<n;j++){
						if(f[j][p]==true) f[j][q] = true;
						if(f[j][q]==true) f[j][p] = true;
						if(f[p][j]==true) f[q][j] = true;
						if(f[q][j]==true) f[p][j] = true;
					}
				}
			}
			System.out.println(sum/100);
		}	
	}	
}