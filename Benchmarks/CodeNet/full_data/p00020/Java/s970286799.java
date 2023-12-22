import java.io.*;
class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(reader.readLine().toUpperCase());
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}