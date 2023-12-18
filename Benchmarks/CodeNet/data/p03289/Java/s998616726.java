import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		if (str.matches("^A[a-z][a-z]*C+[a-z]{2}$")) System.out.println("AC");
		else System.out.println("WA");
	}
}