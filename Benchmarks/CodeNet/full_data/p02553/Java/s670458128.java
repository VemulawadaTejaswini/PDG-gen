import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input[] = br.readLine().split(" ");
	long a = Long.parseLong(input[0]);
	long b = Long.parseLong(input[1]);
	long c = Long.parseLong(input[2]);
	long d = Long.parseLong(input[3]);

	System.out.println(Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d)));
    }
}