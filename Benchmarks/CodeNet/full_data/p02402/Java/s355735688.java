import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    int n = 0;

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }

	    br.close();

	    for (Integer i = 0; i < lines.size(); i++) {
		if (i==0) {
		    n = Integer.parseInt(lines.get(i));
		} else {
		    String[] splits = lines.get(i).split(" ");
		    List<Integer> numbers = new ArrayList<Integer>();
		    for ( int j = 0; j < splits.length; j++ ) {
			numbers.add(j, Integer.parseInt(splits[j]));
		    }

		    numbers.sort(Comparator.naturalOrder());
		    Integer min = numbers.get(0);
		    numbers.sort(Comparator.reverseOrder());
		    Integer max = numbers.get(0);

		    Integer sum = 0;
		    for (Integer e : numbers) {
			sum += e;
		    }

		    System.out.println(String.format("%d %d %d", min, max, sum));
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