import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) throws Exception{    
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        long c = 0;
        
        
        if(b >= x){
        	c += (b/x) - (a/x);
        } else {
        	c += (b/x) - (a/x) + 1;
        }
        
        if(a%x == 0 && b%x == 0) c++;
        
        
        System.out.println(c);
        
        sc.close();
    }
}