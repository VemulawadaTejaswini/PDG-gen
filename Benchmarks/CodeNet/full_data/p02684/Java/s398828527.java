import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	long k = sc.nextLong();
      	int[] teleport = new int[n];
      	for (int i = 0; i < n; i++) teleport[i] = sc.nextInt()-1;
      	
      	if(teleport[0] == 0) {
      	    System.out.println(1);
      	    System.exit(0);
      	}
      	
      	List<Integer> list = new ArrayList<Integer>();
      	list.add(0);
      	
      	long end = 0;
      	long start = 0;

      	int result = 0;
      	
      	while(k > end) {
      	    result = teleport[result];
      	    if (list.contains(result)) {
      	        start = (long)list.indexOf(result);
      	        long re = (k - start)%(end - start+1) + start;
      	        System.out.println(list.get((int)re)+1);
      	        System.exit(0);
      	    }
      	    list.add(result);
      	    end++;
      	}
      	
        System.out.println(result);
      	
    }
}