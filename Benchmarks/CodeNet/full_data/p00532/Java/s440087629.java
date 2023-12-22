import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		int[] number = new int[n];
		
		String[] tag = reader.readLine().split(" ");
		int[] target = new int[m];
		for(int i = 0; i < m; i++)
			target[i] = Integer.parseInt(tag[i]);
		
		for(int i = 0; i < m; i++){
			String[] vote = reader.readLine().split(" ");
			for(int j = 0; j < n; j++){
				int targ = Integer.parseInt(vote[j]);
				
				if(targ == target[i]){
					number[j]++;
				}else{
					number[target[i] - 1]++;
				}
			}
		}
		for(int i = 0; i < n; i++)
			System.out.println(number[i]);
			
		reader.close();
	}
}