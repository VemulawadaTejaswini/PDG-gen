import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{

    static StringBuilder sb;

    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    br.close();

	    //lines.add("3 4");
	    //lines.add("1 2 0 1");
	    //lines.add("0 3 0 1");
	    //lines.add("4 1 1 0");
	    //lines.add("1");
	    //lines.add("2");
	    //lines.add("3");
	    //lines.add("0");

	    for (int i = 0; i < lines.size(); i++) {
		Integer m = Integer.parseInt(lines.get(i).split(" ")[0]);
		Integer f = Integer.parseInt(lines.get(i).split(" ")[1]);
		Integer r = Integer.parseInt(lines.get(i).split(" ")[2]);

		if (m == -1 || f == -1) {
		    System.out.println("F");
		} else if (m+f => 80) {
		    System.out.println("A");
		} else if (65 =< m+f && m+f < 80) {
		    System.out.println("B");
		} else if (50 =< m+f && m+f < 65) {
		    System.out.println("C");
		} else if (30 =< m+f && m+f < 50) {
		    if (r != -1 && r => 50) {
			System.out.println("C");
		    } else {
			System.out.println("D");
		    }
		} else {
		    System.out.println("F");
		}
	    }

	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}