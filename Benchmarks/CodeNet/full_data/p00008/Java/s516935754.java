import java.io.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int count = 0;
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 10; b++){
							
			for(int c = 0; c < 10; c++){
				
				
			for(int d = 0; d < 10; d++){
				if(a+b+c+d == n)
					count++;
			}}	
			}	
			
		}
		System.out.println(count);
	}

}