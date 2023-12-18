    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan =new Scanner(System.in);
    		int n=Integer.parseInt(scan.next());
    		int m=Integer.parseInt(scan.next());
    		
    		
    		int ans=n*(n-1)/2+m*(m-1)/2;
    		System.out.print(ans);
    }
    }
// end 