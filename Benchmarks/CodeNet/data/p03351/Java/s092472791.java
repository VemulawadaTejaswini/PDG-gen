    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		int c=Integer.parseInt(scan.next());
    		int d=Integer.parseInt(scan.next());
    		
    		if ((Math.abs(a-b)<=d&&Math.abs(c-b)<=d)||Math.abs(a-c)<=d) {
    			System.out.print("Yes");
    		}else {
    			System.out.print("No");
    		}
    	


    		
     
    }
    }
// end 