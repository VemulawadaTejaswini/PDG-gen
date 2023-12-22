import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int pasta[] = new int[3];
		int juice[] = new int[2];
		int cost = 2000 * 2000;
		
		for(int i = 0; i < 3; i++) pasta[i] = Integer.valueOf(reader.readLine());
		for(int i = 0; i < 2; i++) juice[i] = Integer.valueOf(reader.readLine());
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				cost = Math.min(cost, pasta[i] + juice[j] - 50);
			}
		}
		System.out.println(cost);
		reader.close();
	}
}