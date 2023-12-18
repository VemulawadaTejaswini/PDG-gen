
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int m=gi();
	    int[] p=new int[m];
	    int[] y=new int[m];
	    Map<Integer, List<Integer>> map=new HashMap<Integer, List<Integer>>();
	    for (int i=0; i<m;i++) {
	    	p[i]=gi();
	    	y[i]=gi();
	    	if (!map.containsKey(p[i])) {
	    		List<Integer> l=new ArrayList<Integer>();
	    		l.add(y[i]);
	    		map.put(p[i], l);
	    	} else {
	    		List<Integer> l=map.get(p[i]);
	    		l.add(y[i]);
	    	}
	    }

	    for (Map.Entry<Integer, List<Integer>> entry:map.entrySet()) {
            List<Integer> l=entry.getValue();
            Collections.sort(l);
	    }

	    for (int i=0; i<m;i++) {
	    	List<Integer> l=map.get(p[i]);
	    	int index=l.indexOf(y[i]);
	    	System.out.println(String.format("%06d", p[i]) + String.format("%06d", index+1));
	    }

	    //System.out.println(c);
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}