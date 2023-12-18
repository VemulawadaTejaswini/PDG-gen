
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static long[][] dp;
    static int ind=1;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int m=gi();
	    int[] P=new int[m];
	    int[] Y=new int[m];
        List<List<Integer>> li=new ArrayList<List<Integer>>();

        for (int i=0; i<100001;i++) {
        	li.add(null);
        }

        for (int i=0; i< m;i++) {
        	P[i]=gi();
        	Y[i]=gi();
        	if(li.get(P[i]) !=null) {
                li.get(P[i]).add(Y[i]);
        	} else {
        		List<Integer> l=new ArrayList<Integer>();
        		l.add(Y[i]);
        		li.add(l);
        	}
        }

        for(List<Integer> a : li) {
        	if(a!=null) {
            Collections.sort(a);
        	}
        }

        for (int i=0; i<m;i++) {
        	int p=P[i];
        	int y=li.get(p).indexOf(Y[i])+1;
        	System.out.println(String.format("%06d", p) + String.format("%0"
        			+ "6d", y));
        }

        //System.out.println(max);
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