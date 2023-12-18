import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String message = br.readLine();
	message = message.replaceAll("[a-z]", "x");
	System.out.println(message);
    }
}