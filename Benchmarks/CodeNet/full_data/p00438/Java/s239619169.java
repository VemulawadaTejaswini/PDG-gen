import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main {
	static int x ;
	static int y ;
	static int road[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] ss = in.readLine().split(" ");
			x = Integer.parseInt(ss[0]);
			y = Integer.parseInt(ss[1]);
			if(x == 0&&y ==0){
				break;
			}
			road = new int[x][y];
			for(int i = 0;i<x ;i++){
				Arrays.fill(road[i],-1);
			}
			int n = Integer.parseInt(in.readLine());
			for(int i= 0; i < n;i++){
				String[] s = in.readLine().split(" ");
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				road[a-1][b-1] = 0;
			}
			road[0][0] = 1;
			for(int i = 0;i<road.length;i++){
				for(int j = 0;j< road[i].length;j++){
					if(road[i][j] != 0){
						if(i != 0){
							if(road[i][j] == -1) road[i][j]++;
							road[i][j] = road[i][j]+road[i-1][j];
						}
						if(j != 0){
							if(road[i][j] == -1) road[i][j]++;
							road[i][j] = road[i][j]+road[i][j-1];
						}
					}
				}
			}
			System.out.println(road[x-1][y-1]);
		}	

	}
}