import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        int max = max(p,max(q,r));
        System.out.println(p*q*r / max);
        
    }
}
