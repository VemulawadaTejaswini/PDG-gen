import java.util.*;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = Integer.parseInt(sc.next());
	    int k = Integer.parseInt(sc.next());
	    
	       
	    int[] altura = new int[n];
	    int[] custo = new int[n];
	    
	    Arrays.fill(custo, Integer.MAX_VALUE);
	    custo[0] = 0;
	    
	    for(int i = 0; i < n; i++) altura[i] = Integer.parseInt(sc.next());
	    
	    for(int i = 0; i < n; i++) {
	      for(int j = 1; j <= k && i + j < n; j++) {
	        custo[i+j] = Math.min(custo[i+j], custo[i] + Math.abs(altura[i+j] - altura[i]));
	      }
	    }
	    
	    System.out.println(custo[n-1]);
	  }


}
