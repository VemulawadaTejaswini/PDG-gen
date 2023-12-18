package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    	//task 1
//	    Scanner s = new Scanner(System.in);
//	    int n = s.nextInt(), m = s.nextInt() - 1;
//	    char[] cs = s.next().toCharArray();
//	    //A - a = -32
//	    cs[m] += ('a' - 'A');
//	    System.out.println(cs);

		//task2

		Scanner s = new Scanner((System.in));
		int n = s.nextInt();
		int fh = n / 100;
		int sh = n % 100;
		
		System.out.println(isMonth(fh) ? isMonth(sh) ? "AMBIGUOUS " : "MMYY" : isMonth(sh) ? "YYMM" : "NA");

    }

    public static Boolean isMonth(int i){
    	return (1 <= i) && (i <= 12);
	}


}
