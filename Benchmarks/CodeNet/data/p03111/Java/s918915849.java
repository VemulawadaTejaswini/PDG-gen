
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	static int[] l;
	static int n;
	static int a;
	static int b;
	static int c;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        n=gi();
        a=gi();
        b=gi();
        c=gi();
        l=new int[n];

        for (int i=0; i<n;i++) {
            l[i]=gi();
        }

        System.out.println(f(0,0,0,0));
	}

	public static int f(int cur, int av, int bv, int cv) {
        if(cur==n) {
        	if (av==0 || bv==0 || cv==0) {
        		return 100000;
        	} else {
        		return Math.abs(av-a) +Math.abs(bv-b) + Math.abs(cv-c) - 30;
        	}
        }

        int ret1 = f(cur+1, av + l[cur], bv, cv) + 10;
        int ret2 = f(cur+1, av, bv+ l[cur], cv) +10;
        int ret3 = f(cur+1, av, bv, cv+ l[cur]) +10;
        int ret4 = f(cur+1, av, bv, cv);

        return Math.min(Math.min(ret1, ret2), Math.min(ret3, ret4));

	}

	public static int mp(LinkedList<Integer> li, int m) {
		int v = 0;
		Iterator<Integer> it=li.iterator();
		while (it.hasNext()) {
			int ii=it.next();
            v +=l[ii];
		}

		return (10*(li.size()-1)) + Math.abs(v-m);
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