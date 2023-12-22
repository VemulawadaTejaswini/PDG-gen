import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, s;
		
		int res[][] = new int[11][1001];
		res[0][0] = 1;
		for(int i = 0; i <= 100; i++){
			for(int j = 9; j >= 0; j--){
				for(int k = 0; k + i <= 1000; k++){
					res[j + 1][i + k] += res[j][k];
				}
			}
		}
		
		while(!(string = reader.readLine()).equals("0 0")){
			n = Integer.valueOf(string.split(" ")[0]);
			s = Integer.valueOf(string.split(" ")[1]);
			
			System.out.println(res[n][s]);
		}
		reader.close();
	}
}