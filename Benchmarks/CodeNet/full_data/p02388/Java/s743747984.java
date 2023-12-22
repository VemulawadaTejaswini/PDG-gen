import java.io.*;

public class XCubic {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String input = in.readLine();
		 Integer result = (int) Math.pow(Integer.parseInt(input), 3);
		 System.out.println(result);
	}

}