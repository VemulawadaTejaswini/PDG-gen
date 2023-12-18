
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
	    ArrayList<Integer>[] li=new ArrayList[n+1];

        for (int i=0; i< m;i++) {
        	P[i]=gi();
        	Y[i]=gi();
            if(li[P[i]]!=null) {
            	li[P[i]].add(Y[i]);
            } else {
            	ArrayList<Integer> l=new ArrayList<Integer>();
            	l.add(Y[i]);
            	li[P[i]]=l;
            }
        }

        for(int i=1; i<n;i++) {
        	List<Integer> ll=li[i];
        	if(ll.size()>1) Collections.sort(ll);
        }

        for (int i=0; i<m;i++) {
        	int p=P[i];
        	long y=(long)li[p].indexOf(Y[i])+1l;
        	System.out.println(String.format("%012d", (long)p*1000000l+y));
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