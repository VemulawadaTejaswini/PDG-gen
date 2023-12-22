import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.Math.PI;

public class Main{
    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int i = 0, n = 0;

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		if (i==0) {
		    n = Integer.parseInt(line);
		} else {
		    String[] splits = line.split(" ");
		    List<Integer> numbers = new ArrayList<Integer>(splits.length);
		    for ( int j = 0; j < splits.length; j++ ) {
			numbers.set(j, Integer.parseInt(splits[j]));
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
                i++;
	    }
	    br.close();
	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}