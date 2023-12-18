    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan =new Scanner(System.in);
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		int c=Integer.parseInt(scan.next());
    		

    		if(a==b && b==c) {
    			System.out.print(1);
    		}else if (a==b || a==c||b==c) {
    			System.out.print(2);
    		}else {
    			System.out.print(3);
    		}
    		
    }
     
    }