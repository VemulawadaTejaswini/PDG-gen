import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double h = sc.nextInt();
        double w = sc.nextInt();
        double ans = (double)h/2.0*w;
        
        //System.out.println(a);
        if(h%2==1){
            ans+=1;
        //System.out.println((int)ans);
        }
        
        System.out.println((int)ans);
    }
}
