import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		int n, m, count;
		String s, IOI;
		
		while((n = Integer.valueOf(reader.readLine())) != 0){
			m = Integer.valueOf(reader.readLine());
			s = reader.readLine();
			
			IOI = "I";
			for(int i = 0; i < n; i++) IOI += "OI";
			
			count = 0;
			for(int i = 0; i < m - n * 2 - 1; i++)
				if(s.substring(i, i + n * 2 + 1).equals(IOI))count++;
			
			System.out.println(count);
		}
	}
}