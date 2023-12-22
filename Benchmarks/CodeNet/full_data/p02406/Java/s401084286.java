import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int n = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= n; i++){
			if(String.valueOf(i).indexOf("3") != -1 ||
			   i % 3 == 0){
				System.out.print(" " + i);
			}
		}
		System.out.println();
		
		reader.close();
	}
}