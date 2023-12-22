
import java.util.*;

public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int [] arr = new int [ n+1];
    for(int i =1 ; i <=n ; i++) {
    	arr[i] = sc.nextInt();
    	
    }
    
    HashSet<Integer> s  = new HashSet<Integer>();
    int in = 1;
    int count = 0; 
    while(!s.contains(in)) {
    	count++;
    	s.add(in);
    	in = arr[in];
    }
    int cycle= 1 ; 
    int cy  = in ;
    in = arr[in];
    while(in!=cy) {
    	in = arr[in];
    	cycle++;
    }
   // System.out.println(count + " "+cycle);
    int rem = (int) ((k-(count-cycle)) % (long)cycle) + (count- cycle) ;
    k = (rem) ;
    in = 1; 
   // System.out.println(k);
    while(k >=1) {
    	in = arr[in];
    	k--;
    }
    
    System.out.println(in);
	}

	
}