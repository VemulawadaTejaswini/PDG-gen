import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        
        long ans = Math.min(a+(b-a)/2, n-b+1+(b-a)/2);
        if((b-a)%2==0){
            ans = (b-a)/2;
        }
        
        System.out.println(ans);
    }
}
