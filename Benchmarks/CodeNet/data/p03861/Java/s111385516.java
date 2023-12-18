import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) throws Exception{    
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        long c = 0;
        
        if(a != 0 && a/x == 0){
        	a = 1;
        } else {
        	a = a / x;
        }
        
        c += (b/x) - (a) + 1;
        
        System.out.println(c);
        
        sc.close();
    }
}