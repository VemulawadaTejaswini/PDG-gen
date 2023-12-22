import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    String line = br.readLine();

	    ArrayList<Integer> list = new ArrayList<>();
	    for (int i = 0; i < n; i++) {
	    	list.add(Integer.parseInt(line.split(" ")[i]));
	    }

	    Collections.sort(list);

	    String[] strArray = new String[list.size()];

	    int j = 0;
	    for (int i = list.size() - 1; i >= 0; i--) {
	    	strArray[j++] = Integer.toString(list.get(i));
	    }
	    System.out.println(String.join(" ", strArray));

	}
}