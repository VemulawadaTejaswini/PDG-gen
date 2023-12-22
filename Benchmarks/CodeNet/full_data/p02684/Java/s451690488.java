import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	long k = sc.nextLong();
      	int[] teleport = new int[n];
      	for (int i = 0; i < n; i++) teleport[i] = sc.nextInt()-1;
      	
      	int result = 0;
      	
      	List<Integer> list = new ArrayList<Integer>();
      	list.add(result);
      	
      	long end = 0;
      	long start = 0;
      	
      	boolean flag = true;
      	
      	while(k > end) {
      	    result = teleport[result];
      	    if (list.contains(result)) {
      	        start = (long)list.indexOf(result);
      	        long re = (k - start)%(end - start+1) + start;
      	        System.out.println(teleport[(int)re]+1);
      	        flag = false;
      	        break;
      	    }
      	    list.add(result);
      	    end++;
      	}
      	
      	if(flag) System.out.println(result);
      	
    }
}