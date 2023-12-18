import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
		int n = in.nextInt();
    	int m = in.nextInt();
		int[] a =new int[n];
    	int sum = 0 ;
    	for(int i = 0;i < n; i++){
	    	a[i] = in.nextInt();
    		sum += a[i];
	    }
     
    	double border = sum*(1d/(4*m));  
		int count = 0;
	    for(int i =0; i <n; i++){
			if(a[i]>= border){
            	count++;
        	}
    	}  
    	if(count >= m){
    		System.out.print("Yes");
    	}else{
        	System.out.print("No");
    	}
    }
}    
