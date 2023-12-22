import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main {
	static int x ;
	static int y ;
	static int road[][];
	static int ans;
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
				Arrays.fill(road[i],0);
			}
			int n = Integer.parseInt(in.readLine());
			for(int i= 0; i < n;i++){
				String[] s = in.readLine().split(" ");
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				road[a-1][b-1] = -1;
			}
			ans =0;
			saiki(1,1);
			System.out.println(ans);
		}	

	}
	static void saiki(int x2,int y2){
		
		if(x == x2 && y == y2){
			System.out.println("ok");
			ans++;
			return;
		}
		else if(road[x2-1][y2-1] == -1){
			return ;
		}
		if(x2+1 <= x){
			saiki(x2+1,y2);
		}
		if(y2+1 <= y){
			saiki(x2,y2+1);
		}
		return;
	}

}