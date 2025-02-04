import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String s[];
		
		int n, res;
		while(true){
			if((n = Integer.valueOf(reader.readLine())) == 0) break;
			
			s = reader.readLine().split(" ");
			res = 0;
			for(int i = 1; i < n; i += 2){
				res += app.check(s[i], s[i - 1]);
			}
			System.out.println(res);
		}
		reader.close();
	}
	public int check(String x, String y){
		char l[] = x.toCharArray();
		char r[] = y.toCharArray();
		
		if(l[0] == r[0]){
			return 0;
		}else return 1;
	}
}