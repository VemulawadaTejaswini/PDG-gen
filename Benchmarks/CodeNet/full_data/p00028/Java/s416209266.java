import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main{
	

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[101];
		String price;
		
		while((price = br.readLine()) != null){
			num[Integer.parseInt(price)]++;
		}
		
		int max = -1;
		
		for(int i = 1;i <= 100;i++){
			
			if(max<num[i]){
				max = num[i];
			}
			
		}
		
		for(int i = 1;i <= 100;i++){
			
			if(max == num[i]){
				System.out.println(i);
			}
			
		}
	}
}