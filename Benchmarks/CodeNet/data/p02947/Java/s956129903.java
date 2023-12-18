import java.util.*; 


public class Main
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.nextLine();
	    String[] A = new String[n];
	    
	    
	    for(int i=0;i<n;i++) {
	    	A[i] = in.nextLine();
	    	
	    }
	    
	    for(int i=0;i<n;i++) {
	    	char[] stringArray = A[i].toCharArray();
	    	Arrays.sort(stringArray);
	    	A[i] = new String(stringArray);
	    }
	    
	    Arrays.sort(A);
	    
	    int dist = 1;
	    String current = A[0];
	    for(int i=0;i<n;i++) {
	    	if(!A[i].equals(current)) {
	    		dist++;
	    		current = A[i];
	    		
	    	}
	    	
	    }
	    int[] D = new int[dist];
	    D[0] = 1;
	    current = A[0];
	    int j =0 ;
	    for(int i=1;i<n;i++) {
	    	if(current.equals(A[i])) {
	    		D[j]++;
	    	}
	    	else {
	    		current = A[i];
	    		D[++j] = 1;
	    	}
	    }
	    
	    long ans = 0;
	    for(int i=0;i<dist;i++) {
	    	
	    	ans+= D[i]*(D[i]-1)/2;
	    }
	    System.out.println(ans);
	 }
	
	
	
	
	
	
	 

}



