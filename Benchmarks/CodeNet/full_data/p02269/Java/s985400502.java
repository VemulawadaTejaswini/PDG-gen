import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        Scanner as = new Scanner(System.in);
        
        int n = 0;
        
        n = Integer.parseInt(as.next());
        
        for(int i=0;i<n;i++){
        	
	        switch(as.next()){
	        case "insert":
	        	sb.append(":").append(as.next()).append(":");
	        	break;
	        
	        case "find":
	        	if(sb.indexOf(":"+as.next()+":") != -1){
	        		
	        		System.out.println("yes");
	        		
	        	}
	        	else{
	        		
	        		System.out.println("no");
	        		
	        	}
	        	break;
	        	
	        }
	        
        }

	}

}