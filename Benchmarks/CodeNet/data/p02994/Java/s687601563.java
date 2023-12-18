import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int L = sc.nextInt();
	    
	    if (L>=0){
	    	int ans =0;
	    	for (int i=L+1; i<N+L; i++){
	    		ans+=i;
	    	}
	    	System.out.println(ans);
	    }
	    	
	    else if (N+L>=0){
	    	int ans =0;
	    	for (int i=L; i<N+L; i++){
	    		ans+=i;
	    	}
	    	System.out.println(ans);
	    }
	    
	    else {
	    	int ans = 0;
	    	for (int i=L; i<N+L-1; i++){
	    		ans+=i;
	    	}
	    	System.out.println(ans);
	    }
	    
	    
	    
	    
	    System.out.println();

	}

}
