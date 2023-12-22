import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArray[] = br.readLine().split(" ");
	int n = Integer.parseInt(strArray[0]);
	int m = Integer.parseInt(strArray[1]);
	long k = Integer.parseInt(strArray[2]);
	strArray = br.readLine().split(" ");
	List<Integer> a = new ArrayList<Integer>();
	for (String s : strArray) {
	    a.add(Integer.parseInt(s));
	}
	strArray = br.readLine().split(" ");
	List<Integer> b = new ArrayList<Integer>();
	for (String s : strArray) {
	    b.add(Integer.parseInt(s));
	}

	int count = 0;
	while (k > 0) {
	    int shorter = 0;
	    if (a.size() > 0 && b.size() > 0) {
		if (a.get(0) < b.get(0)) {
		    shorter = a.get(0);
		    a.remove(0);
		} else {
		    shorter = b.get(0);
		    b.remove(0);
		}
	    } else if (a.size() > 0) {
		shorter = a.get(0);
		a.remove(0);
	    } else if (b.size() > 0) {
		shorter = b.get(0);
		b.remove(0);
	    } else {
		k = 0;
	    }
	    k -= shorter;
	    if (k >= 0) {
		count++;
	    }
	}
	System.out.println(count);
    }
}
