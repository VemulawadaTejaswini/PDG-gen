import java.io.*;

public class Main{
	public static void main(String[] args){
		
		try(
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		){
			
			
			int M = Integer.parseInt(br.readLine());
			
			
			if( M != Math.round(M) ||
				M < 1 || M > 23 ){
				new IllegalArgumentException();
			}
			
			System.out.println( (24 - M ) + 24);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
