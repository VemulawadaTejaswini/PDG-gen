import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L_1_2 {

	public static void main(String[] args){
	try{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int x = Integer.parseInt(input);
		System.out.println(x * x * x);
	br.close();
	}catch(Exception e){
		e.getStackTrace();
		System.exit(0);
	}
	}
}