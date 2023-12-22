import java.util.StringTokenizer;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String input = br.readLine();
			StringTokenizer token;
			while(input != null){
				token = new StringTokenizer(input);
				int num = Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken());
				
				System.out.println((int)Math.log10(num) + 1);
				input = br.readLine();
			}
		}catch(Exception ex){
			System.exit(0);
		}
	}
}