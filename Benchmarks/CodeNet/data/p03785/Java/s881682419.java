

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int C=gi();
	    int K=gi();
	    int[] T= new int[N];
	    Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0; i<N;i++) {
            T[i]=gi();
	    }
	    
        Arrays.parallelSort(T);
        
        long s=0;
        long bc=0;
        for(int i=0; i<N; i++) {
        	if ((q.size()!=0) && ((q.size()==C) || (K<T[i]-q.peek()))) {
        		q.clear();
        		bc++;
        	}
        	q.add(T[i]);
        }
        
        if(q.size()!=0)bc++;

		System.out.println(bc);
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