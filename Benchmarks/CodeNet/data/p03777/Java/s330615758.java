
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		//Scanner scan = new Scanner(System.in);

	String[] str = new String[4];
	str = line.split(" ");
	
	if(str[0].equals(str[1]))
			System.out.println("H");
	else
		System.out.println("D");
				
	
			
	}
}