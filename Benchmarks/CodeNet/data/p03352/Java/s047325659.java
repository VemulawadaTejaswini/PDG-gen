import java.util.*;

public class Main {


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

    	int X=sc.nextInt();
    	
    	boolean[] expX=new boolean[X+1];
    	
    	Arrays.fill(expX,false);
      
      	expX[1]=true;
    	
    	for(int b=2;b<=X;b++) {
    		
    		int v=b*b;
    		
    		while(v<=X) {
    			
    			expX[v]=true;
    			
    			v*=b;
    			
    		}
    	}
    	
    	for(int i=X;i>=0;i--) {
    		
    		if(expX[i]) {
    			System.out.println(i);
    			return ;
    		}
    		
    	}

    }


}