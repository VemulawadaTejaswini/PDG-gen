import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] array = br.readLine().split(" ");

	int X = Integer.parseInt(array[0]), A = Integer.parseInt(array[1]);

	System.out.println(A > X ? 0 : 10);
    }
}