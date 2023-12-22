import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] numbers = line.split(" ");
		
		int x = Integer.parseInt(numbers[0]);
		int y = Integer.parseInt(numbers[1]);
		
		int max = Math.max(x, y);
		int min = Math.min(x, y);
				
		while(true){
			if(max % min == 0){
				break;
			}
			
			//ユークリッドの互除法
			int v = min;
			min = max % min;
			max = v;
		}
		
		System.out.println(min);
		
	}
	
}