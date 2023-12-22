import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
	try {
	    BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	    String line;
	    String[] a;
	    ArrayList<String> ans = new ArrayList<String>();
	    while (true) {
		line = stdReader.readLine();
		a = line.split(" ");
		if (a[1].equals("?")) {
		    break;
		} else if (a[1].equals("+")) {
		    ans.add(Integer.parseInt(a[0]) + Integer.parseInt(a[2]) + " ");
		} else if (a[1].equals("-")) {
		    ans.add(Integer.parseInt(a[0]) - Integer.parseInt(a[2]) + " ");
		} else if (a[1].equals("*")) {
		    ans.add(Integer.parseInt(a[0]) * Integer.parseInt(a[2]) + " ");
		} else if (a[1].equals("/")) {
		    if (a[0].equals("0") || a[2].equals("0")) {
			ans.add("Error");
		    } else {
			ans.add(Integer.parseInt(a[0]) / Integer.parseInt(a[2]) + " ");
		    }
		}
	    }
	    for (int i = 0; i < ans.size(); i++) {
		System.out.println(ans.get(i));
	    }
	} catch (Exception e) {
	    e.getStackTrace();
	    System.exit(-1);
	}
    }
}