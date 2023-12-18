    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		char[] n=scan.next().toCharArray();
    		int ans =0;
    		for(int i=0;i<4;++i) {
    			for (int j=++i;j<4;j++) {
    				if (n[i]!=n[j]) {
    					++ans;
    				}
    			}
    		}
    		System.out.print(ans>1?"No":"Yes") ;   	
  
    				
 
     
    }
    }
// end 