import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, ans;
		double res, min;
		
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.valueOf(string);
			
			min = 1 << 29;
			ans = 0;
			for(int i = 0; i < n; i++){
				String str[] = reader.readLine().split(" ");
				
				res = Double.valueOf(str[2]) / Math.pow(Double.valueOf(str[1]) / 100 , 2);
				res = 22. > res ? 22. - res : res - 22.;
				if(min > res){
					min = res;
					ans = Integer.valueOf(str[0]);
				}
			}
			System.out.println(ans);
		}
		reader.close();
	}
}