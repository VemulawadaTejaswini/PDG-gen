import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{	
	
	public static void main (String[] args)throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		String name = reader.readLine();
		char[] data = name.toCharArray();
		
		for(int i=data.length-1;i>=0;i--){
			System.out.print(data[i]);
		}
		System.out.println();
		
	}
}