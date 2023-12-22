import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] map = new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				int in = sc.nextInt();
				if(in==1) map[i][j] = 1;
				else map[i][j] = -1;
			}
		}
		
		int cnt = 0;
		for(int i=0;i<r;i++){
			int a = 0;
			int b = c-1;
			while(true){
				if(map[i][a]==1){
					cnt++;
					if(i+1<r) map[i+1][a] *= -1;
					if(a+1<c) map[i][a+1] *= -1;
					a++;
				}else{
					if(map[i][b]==1) cnt++;
					if(i+1<r) map[i+1][b] *= -1;
					if(b-1>=0) map[i][b-1] *= -1;
					b--;
				}
				if(b<a) break;
			}
		}
		
		System.out.println(cnt);
	}

	
}