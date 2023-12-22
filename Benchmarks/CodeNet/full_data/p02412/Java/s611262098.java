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

    private static Set<ArrayList<Integer>> getCombination(ArrayList<Integer> n, Integer m) {
	Set<ArrayList<Integer>> ans = new HashSet<ArrayList<Integer>>();
	combination(n, m, ans);
	//for (ArrayList<Integer> e : ans) {
	//    System.out.println(e.toString());
	//}
	return ans;
    }

    private static void combination(ArrayList<Integer> n, Integer x, Set<ArrayList<Integer>> ans) {
	if (n.stream().mapToInt(t -> t).sum() < x) {
	    return;
	}
	if (n.size() == x) {
	    ans.add(n);
	    return;
	}
	for (int i = 0; i < n.size(); i++) {
	    ArrayList<Integer> N = new ArrayList<Integer>();
	    N.addAll(n);
	    N.remove(i);
	    combination(N,x,ans);
	}
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

		    // 5C3????±???????
		    Set<ArrayList<Integer>> ans = getCombination(n, 3);
		    Integer answer = 0;

		    for (ArrayList<Integer> l : ans) {
			Integer sum = l.stream().mapToInt(t -> t).sum();
			if (sum==x) { answer++; }
		    }
		    System.out.println(answer);
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