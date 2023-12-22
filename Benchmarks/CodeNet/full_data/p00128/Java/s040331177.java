import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(sc.hasNext()){
			if(count!=0) System.out.println();
			int p = sc.nextInt();
			int[][] map = new int[8][5];
			int q = 10000;
			int r = 0;
			for(int i=0;i<5;i++){
				r = p/q;
				p = p%q;
				map[r/5][i] = 1;
				map[2][i] = 2;
				for(int j=0;j<5;j++){
					if(r%5!=j) map[j+3][i] = 1;
				}
				q /= 10;
			}
			for(int i=0;i<8;i++){
				for(int j=0;j<5;j++){
					if(map[i][j]==0) System.out.print(" ");
					else if(map[i][j]==1) System.out.print("*");
					else if(map[i][j]==2) System.out.print("=");
				}
				System.out.println();
			}
			
			count++;
		}
	}	
}