import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	public static int convertTo (ArrayList<Integer> a) {
		int result = 0 ; 
		for(int i = a.size()-1; i >= 0 ; i --) {
			result += (int)(a.get(i)*(Math.pow(10,i)));
		}
		return result ;
	} 
	public static int repeat (int a , HashSet<Integer> b) {
		int c = 0 ;
		 while(a!= 0) {
			 if(b.contains(a%10))
        	    c++ ;
        	  a/=10;
        }
		 return c ;
	}
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int r = N ;
        int K = Integer.parseInt(a[1]);
        HashSet<Integer> kNumbers = new HashSet<>();
        TreeSet<Integer> nNumbers = new TreeSet<>();
        String[] b = br.readLine().split(" ");
        for(int i = 0 ; i < K ; i ++) {
        	kNumbers.add(Integer.parseInt(b[i]));
        }
        while(true) {
        if(repeat(r , kNumbers) == 0) {
        	System.out.print(r);
        	break;
        }
        else
        	r++;
        }
	}
}
