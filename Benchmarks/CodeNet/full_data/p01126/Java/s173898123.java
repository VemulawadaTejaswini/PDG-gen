import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		String str[] = reader.readLine().split(" ");
		int n = Integer.valueOf(str[0]);
		int m = Integer.valueOf(str[1]);
		int a = Integer.valueOf(str[2]) - 1;
		boolean node[][][] = new boolean[n][n][1000], judge;
		for(int i = 0; i < m; i++){
			str = reader.readLine().split(" ");
			node[Integer.valueOf(str[1]) - 1]
				[Integer.valueOf(str[2]) - 1]
				[Integer.valueOf(str[0]) - 1] = true;
		}
		x : for(int i = 999; i >= 0; i--){
			judge = false;
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					if(node[j][k][i]){
						if(j == a){
							a = k;
							judge = true;
						}
						else if(k == a){
							a = j;
							judge = true;
						}
					}
					if(judge) continue x;
				}
			}
		}
		System.out.println(a + 1);
		reader.close();
	}
}