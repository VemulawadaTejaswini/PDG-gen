import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    int a = Integer.parseInt(line.split(" ")[0]);
	    int b = Integer.parseInt(line.split(" ")[1]);
	    int c = Integer.parseInt(line.split(" ")[2]);

	    int count = 0;
	    for (int i = a; i <= b; i++) {
	    	if (c % i == 0) {
	    		count++;
	    	}
	    }

	    System.out.println(count);

	}
}