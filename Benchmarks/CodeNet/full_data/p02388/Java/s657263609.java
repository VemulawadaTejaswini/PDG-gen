import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = new Integer(in.readLine());
		if(num < 1 || num > 100) {
			return;
		}
		System.out.println(num * num * num);

	}

}

