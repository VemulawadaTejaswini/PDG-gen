import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int d[] = new int[num];
		String[] spl = br.readLine().split(" ");
		for(int i = 0 ; i < num ; i++){
			d[i] = Integer.parseInt(spl[i]);
		}
		Arrays.sort(d);
		int map[][] = new int[2][num];
		int ind =0;
		int cnt = 1;
		map[0][0] = d[0];
		for(int i = 1 ; i < num ; i++){
			if(d[i] == map[0][ind]){
				cnt++;
			}else{
				map[1][ind++] = cnt;
				cnt = 1;
				map[0][ind] = d[i];
			}
		}
		map[1][ind++] = cnt;
		int m = Integer.parseInt(br.readLine());
		int t[] = new int[m];
		spl = br.readLine().split(" ");
		for(int i = 0 ; i < m ; i++){
			t[i] = Integer.parseInt(spl[i]);
		}
		boolean flg = true;
		for(int i = 0 ; i < m ; i++){
			flg = true;
			for(int j = 0 ; j < num ; j++){
				if(map[0][j] > t[i]){
					break;
				}else if(map[0][j] == t[i]){
					if(map[0][j] > 0){
						map[1][j] += -1;
						flg = false;
					}
					break;
				}
			}
			if(flg){
				break;
			}
		}
		if(flg){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		
		
	}
}