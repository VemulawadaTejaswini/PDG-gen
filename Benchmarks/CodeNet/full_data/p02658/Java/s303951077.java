import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long n = Long.parseLong(br.readLine());
	String array[] = br.readLine().split(" ");
	long ans = 1;
	for (int i = 0; i < n; i++) {
	    long a = Long.parseLong(array[i]);
	    if (a == 0) {
		ans = 0;
	    } else {
		if (ans <= (long) Math.pow(10, 18) / a) {
		    if (ans >= 0)
			ans *= a;
		} else {
		    ans = -1;
		}
	    }

	}
	System.out.println(ans);
    }
}
