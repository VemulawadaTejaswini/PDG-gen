import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long num = Long.parseLong(br.readLine());
	List<Long> longArray = new ArrayList<Long>();
	while (num > 0) {
	    longArray.add(num % 26);
	    num /= 26;
	}
	for (int i = longArray.size() - 1; i >= 0; i--) {
	    System.out.print((char) ('a' + (longArray.get(i) - 1)));
	}
    }

}