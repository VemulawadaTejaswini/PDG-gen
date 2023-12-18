import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        double d = Math.log10(n) / Math.log10(k);
        
        System.out.println((int)Math.ceil(d));
    }
}
