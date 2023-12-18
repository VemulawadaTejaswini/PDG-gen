import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int cash=Integer.parseInt(in.readLine());
		
		long total=(cash/500)*1000;
		
		cash%=500;
		
		total+=(cash/5)*5;
		
		
		System.out.println(total);
		

	}

}
