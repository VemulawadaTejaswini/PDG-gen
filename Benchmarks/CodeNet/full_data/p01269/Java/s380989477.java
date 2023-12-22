
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		while(n + m + l > 0){
			int[][] road = new int[m][4];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < 4; j++){
					road[i][j] = sc.nextInt();
				}
			}
			//宿場nに予算lでたどり着く時の盗賊の最小値
			int[][] place = new int[n][l + 1];
			for(int[] a : place){
				Arrays.fill(a, INF);
			}
			place[0][0] = 0;
			boolean bContinue = true;
			while(bContinue){
				bContinue = false;
				for(int i = 0; i < m; i++){
					int from = road[i][0] - 1;
					int to = road[i][1] - 1;
					int dist = road[i][2];
					int enemy = road[i][3];
					for(int j = 0; j <= l; j++){
						//金を払っていく場合
						if(j + dist <= l && place[from][j] != INF && (place[from][j] < place[to][j + dist])){
							place[to][j + dist] = place[from][j];
							bContinue = true;
						}
						
						//金を払わない場合
						if(place[from][j] != INF && (place[from][j] + enemy <  place[to][j])){
							place[to][j] = place[from][j] + enemy;
							bContinue = true;
						}
					}
					
					from = road[i][1] - 1;
					to = road[i][0] - 1;
					
					for(int j = 0; j < l; j++){
						//金を払っていく場合
						if(j + dist <= l && place[from][j] != INF && (place[from][j] < place[to][j + dist])){
							place[to][j + dist] = place[from][j];
							bContinue = true;
						}
						
						//金を払わない場合
						if(place[from][j] != INF && (place[from][j] + enemy <  place[to][j])){
							place[to][j] = place[from][j] + enemy;
							bContinue = true;
						}
					}
				}
			}
			int[] dest = place[n - 1];
			Arrays.sort(dest);
			//print(dest);
			System.out.println(dest[0]);
			n = sc.nextInt();
			m = sc.nextInt();
			l = sc.nextInt();
		}
	}
	
	public static void print(int[] a){
		for(int b : a){
			System.out.print(b + " ");
		}
		System.out.println();
	}

}