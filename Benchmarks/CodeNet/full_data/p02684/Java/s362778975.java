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
      	
      	int end = 0;
      	int start = 0;
      	
      	while(k > end) {
      	    result = teleport[result];
      	    if (list.contains(result)) {
      	        start = list.indexOf(result);
      	        break;
      	    }
      	    list.add(result);
      	    end++;
      	}
      	
      	long re = (k - (long)start)%(long)(end - start+1);
      	System.out.println(teleport[start+(int)re]+1);
    }
}