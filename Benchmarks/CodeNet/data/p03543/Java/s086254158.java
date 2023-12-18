    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		char[] s=scan.next().toCharArray();
    		if (s [0]== s [1]&& s [1]== s [2]) {
    			System.out.print("Yes");
    		}else if( s [1]== s [2]&& s [2]== s [3]) {
    			System.out.print("Yes");
    		}else {
    			System.out.print("No");
    		}
  
    				
 
     
    }
    }
// end 