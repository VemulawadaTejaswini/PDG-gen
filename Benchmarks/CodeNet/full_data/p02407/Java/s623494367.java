import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    String line = br.readLine();

	    String[] input = line.split(" ");
	    String[] output = new String[input.length];

	    int len = input.length - 1;
	    for (int i = 0; i < n; i++) {
	    	output[i] = input[len--];
	    }

	    System.out.println(String.join(" ", output));

	}
}