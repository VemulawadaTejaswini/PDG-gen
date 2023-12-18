

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int H=gi();
	    int W=gi();
	    int[][] A=new int[H][W];
	    List<Integer> y=new ArrayList<Integer>();
	    List<Integer> x=new ArrayList<Integer>();
	    List<Integer> yd=new ArrayList<Integer>();
	    List<Integer> xd=new ArrayList<Integer>();
	    
	    for (int i=0;i<H;i++) {
	    	for (int j=0;j<W;j++) {
		    	A[i][j]=gi();
		    }
	    }
	    
	    for (int i=0;i<H;i++) {
	    	for (int j=0;j<W;j++) {
		    	int m=A[i][j];
		    	if(m%2!=0) {
		    		if(i<H-1) {
		    			A[i+1][j]++;
		    			y.add(i+1);
		    			x.add(j+1);
		    			yd.add(i+2);
		    			xd.add(j+1);
		    		} else if(j<W-1) {
		    			A[i][j+1]++;
		    			y.add(i+1);
		    			x.add(j+1);
		    			yd.add(i+1);
		    			xd.add(j+2);
		    		}
		    	}
		    }
	    }

	    StringBuilder sb=new StringBuilder();
	    sb.append(y.size());
	    sb.append(System.lineSeparator());
	    for(int i=0; i<y.size();i++) {
	    	sb.append(y.get(i) + " " + x.get(i) + " " + yd.get(i) + " " + xd.get(i) + System.lineSeparator());
	    }
	    System.out.print(sb);
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