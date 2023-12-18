import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	int i = 1;
	double odd = 0.0000000000, even = 0.0000000000;

	while (i <= N) {
	    if (i % 2 == 0)
		even++;
	    else
		odd++;
	    i++;
	}
	System.out.println(odd / (odd + even));
    }
}