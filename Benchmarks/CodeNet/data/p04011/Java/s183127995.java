    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan=new Scanner(System.in);
    		int n=Integer.parseInt(scan.next());
    		int k=Integer.parseInt(scan.next());
    		int x=Integer.parseInt(scan.next());
    		int y=Integer.parseInt(scan.next());
    		
    		if (n<k) {
    			System.out.print(x*n);
    		}else {
    			System.out.print(k*x+y*(n-k));
    		}
    }
     
    }