
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    Map<String, List<Integer>> m=new TreeMap<String, List<Integer>>();
	    String[] S=new String[N];
	    int[] P=new int[N];


        for (int i=0; i<N; i++) {
        	S[i]=gs();
        	P[i]=gi();
        	if(m.containsKey(S[i])) {
        		List l=m.get(S[i]);
        		l.add(P[i]);
        	} else {
        		List l=new ArrayList();
        		l.add(P[i]);
        		m.put(S[i], l);
        	}
        }
        
        for(String str : m.keySet()) {
        	List<Integer> l=m.get(str);
        	Collections.sort(l);
        	for (int i=0; i<l.size();i++) {
        		int p=l.get(l.size()-1-i);
        		int r=0;
        		for (int j=0; j<N; j++) {
        			if(S[j].equals(str) && p==P[j]) {
        				r=j+1;
        				break;
        			}
        		}
        		System.out.println(r);
        	}
        }

        //System.out.print(v);

//        if (b>=1 && b<=12) {
//        	if(a>=1 && a<=12) {
//        	    System.out.println("AMBIGUOUS");
//        	} else {
//        		System.out.println("MMYY");
//        	}
//        }else {
//        	if(a>=1 && a<=12) {
//        	    System.out.println("YYMM");
//        	} else {
//        		System.out.println("NA");
//        	}
//        }
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