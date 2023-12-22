import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
	try {
	    BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	    String line = null;
	    String target = stdReader.readLine();
	    ArrayList<String> a = new ArrayList<String>();
	    while (true) {
		line = stdReader.readLine();
		int eot = line.indexOf("END_OF_TEXT");
		if (eot >= 0) {
		    break;
		}
		String[] buf = line.split(" ");
		for (int i = 0; i < buf.length; i++) {
		    a.add(buf[i].toLowerCase());
		}
	    }
	    int counter = 0;
	    for (int i = 0; i < a.size(); i++) {
		if (a.get(i).equals(target)) {
		    counter++;
		}
	    }
	    System.out.println(counter);
	} catch (Exception e) {
	    System.out.println(e);
	    e.getStackTrace();
	    System.exit(-1);
	}
    }
}