import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        

        for(int i=0; i < n; i++){
	    	int a = sc.nextInt();
	    	array[i] = a;
	    }

	    boolean flag=true;
        
        while(true){
            
    	    for(int i=0; i < n; i++){
	    	    if ( array[i] % 2 == 1){
	    	        flag=false;
	    	        break;
	    	    }else{
	    	        array[i]=array[i]/2;
	    	    }
    	    }
	    	
	    	if(!flag)break;
	    	
	    	count++;
	    }

        System.out.println(count);
        sc.close();
    }
}
