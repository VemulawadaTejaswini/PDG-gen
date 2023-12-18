
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    int[] A=new int[N];
	    LinkedList<Integer> l = new LinkedList<Integer>();

        for (int i=0; i<N; i++) {
            A[i]=gi();
            if(i%2==0) {
            	l.addFirst(A[i]);
            } else {
            	l.addLast(A[i]);
            }
        }

        if(N%2==0)Collections.reverse(l);

        Iterator it=l.listIterator();
        boolean f=false;
        while(it.hasNext()) {
        	if(f) {
        		System.out.print(" ");
        	} else {
        		f=true;
        	}
        	System.out.print(it.next());
        }



        //System.out.println(Math.min(mp[N], pm[N]));

//        if(ans==0) {
//
//		    System.out.println("Yes");
//        } else {
//        	System.out.println("No");
//
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