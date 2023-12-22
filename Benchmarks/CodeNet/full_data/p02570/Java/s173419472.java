import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] b = a.split(" ");
		long S = 0 ; 
		long D = 0 ;
		long T = 0 ;
		for(int i  = 0 ; i < b.length ; i++) {
			if(i == 0 )
				D = Long.parseLong(b[i]);
			if(i == 1 )
				T = Long.parseLong(b[i]);
			if(i == 2 )
				S = Long.parseLong(b[i]);
			
		}
		double result = D/S ;
		if(result <= T) 
			System.out.println("Yes");
		else
			System.out.println("No");

		
		
	}

}
