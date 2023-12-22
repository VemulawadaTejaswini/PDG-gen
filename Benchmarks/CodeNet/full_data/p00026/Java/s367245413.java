import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;
		int[][] ans = new int[10][10];
		int count = 0;
		int max_color = 0;

		try {
			while(null != (tmpString = bf.readLine())){
				String[] tmp = tmpString.split(",");
				ans = poton(ans, Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
			}
			for(int i = 0; i < 10; i++){
				for(int j = 0; j < 10; j++){
					if(ans[i][j] == 0){
						count++;
					} else if(ans[i][j] > max_color) {
						max_color = ans[i][j];
					}
				}
			}
			System.out.println(count + " " + max_color);
		} catch (IOException e) {
		}
	}

	private static int[][] poton(int[][] ans, int x, int y, int size){
		switch(size){
		case 3:
			if(x + 2 < 10)ans[x + 2][y] -= -1;
			if(x - 2 >= 0)ans[x - 2][y] -= -1;
			if(y + 2 < 10)ans[x][y + 2] -= -1;
			if(y - 2 >= 0)ans[x][y - 2] -= -1;
		case 2:
			if(x + 1 < 10 && y + 1 < 10)ans[x + 1][y + 1] -= -1;
			if(x + 1 < 10 && y - 1 >= 0)ans[x + 1][y - 1] -= -1;
			if(x - 1 >= 0 && y + 1 < 10)ans[x - 1][y + 1] -= -1;
			if(x - 1 >= 0 && y - 1 >= 0)ans[x - 1][y - 1] -= -1;
		case 1:
			ans[x][y] -= -1;
			if(x + 1 < 10)ans[x + 1][y] -= -1;
			if(x - 1 >= 0)ans[x - 1][y] -= -1;
			if(y + 1 < 10)ans[x][y + 1] -= -1;
			if(y - 1 >= 0)ans[x][y - 1] -= -1;
		}
		return ans;
	}
}