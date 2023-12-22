import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException{
		Main byakko = new Main();
		
		int n,s,count;
		String str;
		
		while((n = Integer.parseInt(reader.readLine())) != 0){
			s = 1;
			count = 0;
			for(int i = 1; i <= n; i++){
				s = s * i;
			}
			str = String.valueOf(s);
			
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(str.length() - i - 1) == '0'){
					count++;
				}
				else break;
			}
			System.out.println(count);
		}
		reader.close();
	}
}