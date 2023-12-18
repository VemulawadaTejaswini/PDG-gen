import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int D = sc.nextInt();
    	while(A>0&&C>0) {
    		C=C-B;
    		if(C<=0)break;
    		A=A-D;
    	}
    	if(A>0) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    	
    	
    	
    	
        		
    }
}
