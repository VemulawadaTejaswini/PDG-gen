import java.util.*;
 
/**
 *
 * @author Admin
 */
public class Main {
    
    
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    
    int D=s.nextInt();
    
    int N=s.nextInt();
int res = D;
     for(int i=0; i<N; i++) {
res *= 100;
    }
System.out.println( res );
    
    
    
    }
}