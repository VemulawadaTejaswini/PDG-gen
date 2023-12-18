import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        
        int br=b+r;
        int sum=(n/br);
        sum *= b;
        int rest=n%br;
        sum += rest>b ? b : rest;
        
        
        //String s = sc.next();
        System.out.println(sum);
    }
    
}