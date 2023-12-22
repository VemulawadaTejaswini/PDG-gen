import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String argv[]) throws IOException {
    	InputStreamReader br = new InputStreamReader(System.in);
    	BufferedReader is = new BufferedReader(br);
    	String aa = is.readLine();
    	String bb = is.readLine();
    	int a = Integer.parseInt(aa);
    	int b = Integer.parseInt(bb);
    	System.out.println(a*b + " " + 2*(a+b));
    }
}