import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        int ans = Math.min(a+(b-a)/2, n-b+1+(b-a)/2);
        if((b-a)%2==0){
            ans = (b-a)/2;
        }
        
        System.out.println(ans);
    }
}
