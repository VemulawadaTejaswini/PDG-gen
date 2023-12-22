import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import java.util.Set;
import java.util.HashSet;

public class Main{

    private static Set<ArrayList<Integer>> ans;
    private static ArrayList<Integer> arr;

    private static void hasArrayTwoCandidates(ArrayList<Integer> a, int arSize, int sum, int x) {
	Integer l = 0;
	Integer r = arSize - 1;

	while (l<r) {
	    if (a.get(l) + a.get(r) == sum) {
		arr = null;
		arr = new ArrayList<Integer>();
		arr.add(a.get(l));
		arr.add(a.get(r));
		arr.add(x - sum);
		Collections.sort(arr);
		ans.add(arr);
		break;
	    } else if (a.get(l) + a.get(r) < sum) {
		l++;
	    } else {
		r--;
	    }
	}
	return;
    }

    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();
	    String line = "";

	    while((line = br.readLine()) != null){
		lines.add(line);
	    }
	    br.close();

	    //lines.add("5 9");
	    //lines.add("0 0");
	    //lines.add("100 200");
	    //lines.add("100 297");
	    //lines.add("0 0");

	    for (String e:lines) {
		if (e.equals("0 0")) {
		    break;
		} else {
		    int initial = Integer.parseInt(e.split(" ")[0]);
		    ArrayList<Integer> n = new ArrayList<Integer>();
		    for (Integer i = 1; i < initial+1; i++) {
			n.add(i);
		    }
		    Integer x = Integer.parseInt(e.split(" ")[1]);

		    // ???????´??????????????´????????±???????????????????
		    ans = null;
		    ans = new HashSet<ArrayList<Integer>>();
		    for (Integer t : n) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.addAll(n);
			a.remove(t);

			//System.out.println("sum: " + x + ", target: " + t + ", target sum: " + (x-t));
			//System.out.println(a.toString());

			hasArrayTwoCandidates(a, a.size(), x - t, x);
		    }

		    //System.out.println(ans.toString());
		    System.out.println(ans.size());
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