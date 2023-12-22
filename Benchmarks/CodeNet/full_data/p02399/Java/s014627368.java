import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
	try {
	    BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	    String line;
	    while ((line = stdReader.readLine()) != null) {
		String[] splits = line.split(" ");

		Integer a = Integer.parseInt(splits[0]);
		Integer b = Integer.parseInt(splits[1]);

		Integer d = a / b;
		Integer r = a % b;
		Float f = Float.parseFloat(args[0]) / Float.parseFloat(args[1]);

		System.out.println( String.format("%d %d %.5f", d, r, f));
	    }
	    stdReader.close();
	} catch (Exception e) {
	    e.getStackTrace();
	    /*?????´??????0??????*/
	    System.exit(0);
	}
    }
}