import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int result = 1;
		boolean skipped = false;
		for(int i=1; i<s.length(); i++){
			if( s.charAt(i-1) == s.charAt(i) && (i == 1 || !skipped || (2 < i && s.charAt(i-2) == s.charAt(i-1))) ){
				i++;
				skipped = true;
			}else
				skipped = false;
			
			result++;
		}
		
		System.out.println(result);
	}
}
