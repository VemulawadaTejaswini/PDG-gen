import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());

		String value[] = inputed.split("[\\s]+");
		int tate = Integer.parseInt(value[0]);
		int yoko = Integer.parseInt(value[1]);

		int fill = tate * yoko;
		int around = tate * 2 + yoko * 2;

		System.out.println(fill + " " + around);



	}
}