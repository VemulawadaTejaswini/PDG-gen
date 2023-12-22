import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if((n|m)==0){
				return;
			}
			int[][] place = new int[2][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					place[0][j] = j+1;
					int tmp = stdIn.nextInt();
					if(tmp>0){
						place[1][j]++;
					}
				}
			}
			for(int i=0;i<m;i++){
				for(int j=m-1;j>i;j--){
					if(place[1][j]>place[1][j-1]){
						int tmp = place[1][j];
						place[1][j] = place[1][j-1];
						place[1][j-1] = tmp;
						tmp = place[0][j];
						place[0][j] = place[0][j-1];
						place[0][j-1] = tmp;
					}
				}
			}
			for(int i=0;i<m-1;i++){
				System.out.print(place[0][i]+" ");
			}
			System.out.println(place[0][m-1]);
		}
	}
}