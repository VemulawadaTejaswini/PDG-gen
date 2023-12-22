import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException {

	BufferedReader br = null;

	try {
	    br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }

	    //lines.add("computer");
	    //lines.add("Nurtures computer scientists and highly-skilled computer engineers");
	    //lines.add("who will create and exploit \"knowledge\" for the new era.");
	    //lines.add("Provides an outstanding computer environment.");
	    //lines.add("END_OF_TEXT");

	    String keyword = lines.get(0);
	    Integer count = 0;

	    for (int i = 1; i < lines.size() - 1; i++) {
		String word = lines.get(i).toLowerCase();
		for (int index = word.indexOf(keyword); index >= 0; index = word.indexOf(keyword, index + 1)) {
		    count++;
		}
	    }

	    System.out.println(count);
	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	} finally {
	    br.close();
	}
    }
}