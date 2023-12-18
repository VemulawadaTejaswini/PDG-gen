import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        double a1 = a / 0.08;
        double a2 = (a+1) / 0.08;
        
        double b1 = b / 0.1;
        double b2 = (b+1) / 0.1;
        
        if(check(a1,a2,b1)){
            System.out.println((int)b1);
        } else if(check(b1,b2,a1)){
            System.out.println((int)a1);
        } else {
            System.out.println("-1");
        }
        
    }
    
    public static boolean check(double a, double b, double check){
        return check >= a && check <= b;
    }
}
