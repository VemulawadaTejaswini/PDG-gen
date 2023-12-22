import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String buf = br.readLine();
        int a = Integer.parseInt(buf);
        int b = Integer.parseInt(buf);
		System.out.print(a * b);
		System.out.print(2 + (a * b));
	}
}