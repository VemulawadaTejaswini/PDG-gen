import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ab=reader.readLine().split(" \\n");
    	System.out.println(ab[2] +" " + ab[1] + " " + ab[0]);
	}
}