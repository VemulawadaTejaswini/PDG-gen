import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		br = new BufferedReader(in);
		int n = ii();
		
		if(n%2==0) {
			System.out.println(n/2);
		}else {
			System.out.println(n/2+1);
		}
		
		
		br.close();
		
	}
	
	static private int ii() throws IOException{
		return Integer.parseInt(br.readLine());
	}
}
