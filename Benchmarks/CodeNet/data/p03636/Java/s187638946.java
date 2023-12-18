import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		
		System.out.print(read.substring(0,1));
		System.out.print(read.length()-2);
		System.out.println(read.substring(read.length()-1, read.length()-1));
		
	}

}