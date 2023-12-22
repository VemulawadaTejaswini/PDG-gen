import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		Main byakko = new Main();
		
		int n = Integer.parseInt(reader.readLine()),x,y;
		String str;
		
		for(int i = 0; i < n; i++){
			str = reader.readLine();
			x = Integer.parseInt(str.split(" ",0)[0]);
			y = Integer.parseInt(str.split(" ",0)[1]);
			
			System.out.println(byakko.daoda(x, y));
		}
		reader.close();
	}
	
	public int daoda(int x, int y){
		if(x < y)return x;
		
		else
			if(x % y == 0)return y;
		
			else return x % y;
	}
	
}