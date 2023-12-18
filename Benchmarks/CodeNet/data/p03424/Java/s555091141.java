import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String s = br.readLine();
		if (s.contains("Y")) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}
}
