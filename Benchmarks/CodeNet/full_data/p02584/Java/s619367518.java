import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	   	Scanner s = new Scanner(System.in);
	    
	    long dis = s.nextLong();
	    long mov = s.nextLong();
	    long am = s.nextLong();
	    
	    if(Math.abs((double)dis/(double)am) < 1.0) {
	    	
	    	if(mov % 2 == 1)
	    		dis = Math.min(Math.abs(dis-am), Math.abs(dis+am));
	    	
	    }else if(Math.abs((double)dis/(double)am) == 1.0) {
	    	
	    	if(mov % 2 == 1)
	    		dis = 0;	    	
	    	
	    }else {
	    	
	    	if(dis < 0) {
	    		
	    		if(Math.abs(Math.floor((double)dis/(double)am)) < mov) {  
	    			
	    			mov -= Math.abs(Math.floor((double)dis/(double)am));
	    			dis += Math.abs(Math.floor((double)dis/(double)am)) * am;	   			
	    				    			
	    			if(mov % 2 == 1)
	    				dis += am;    			
	    		
	    		}else {
	    			
	    			dis += mov * am;
	    			
	    		}
	    		
	    	}else {
	    		
	    		if(Math.abs(Math.floor((double)dis/(double)am)) < mov) {  	    			
	    				 
	    			mov -= Math.abs(Math.floor((double)dis/(double)am));
	    			dis -= Math.abs(Math.floor((double)dis/(double)am)) * am;
	    			
	    			if(mov % 2 == 1)
	    				dis -= am;  
	    		
	    		}else {
	    			
	    			dis -= mov * am;
	    			
	    		}
	    		
	    	}
	    	
	    }
	    
	    System.out.println(Math.abs(dis));
	    
	}

}