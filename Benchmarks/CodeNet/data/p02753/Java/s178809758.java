
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		if(s.equals("AAA") || s.equals("BBB")) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
			
	}

}
