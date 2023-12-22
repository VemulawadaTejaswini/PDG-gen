import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		
		int num[] = new int[101];
		
		while((String price = br.readLine()) != null){
			num[Integer.parseInt(price)]++;
		}
		
		int max = -1;
		
		for(int i = 1;i <= num.length;i++){
			
			if(max<num[i]) max = num[i];
			
		}
		
		for(int i = 1;i <= num.length;i++){
			
			if(max == num[i]) System.out.println(num[i]);
			
		}
	}
}