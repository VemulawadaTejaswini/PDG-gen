import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader din = new BufferedReader( new InputStreamReader(System.in));
		String str = din.readLine();
		str = str.replace("apple","APPLE");
		str = str.replace("peach","apple");
		System.out.println(str.replace("APPLE","peach"));
	}
}