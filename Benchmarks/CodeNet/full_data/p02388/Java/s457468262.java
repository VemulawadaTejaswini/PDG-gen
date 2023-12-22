import java.io.*;


public class Menseki {
	public static void main(String[] args) {
		String line;
		int n;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			line = reader.readLine();
			n = Integer.parseInt(line);
			System.out.println(n*n*n);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
