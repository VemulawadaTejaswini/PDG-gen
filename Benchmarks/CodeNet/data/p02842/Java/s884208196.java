import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        double N = sc.nextDouble();
        double rate = 1.08;
        
        double a = N/rate;
        double a1 = Math.ceil(a);
        double a2 = Math.floor(a);
        //System.out.println(a+":"+a1+":"+a2);
        //System.out.println((int)N+":"+(int)Math.floor(a1*rate)+":"+a2);
        
        if((int)(a1*rate)==(int)N){
            System.out.println((int)a1);
        }else if((int)(a2*rate)==(int)N){
            System.out.println((int)a2);
        }else{
            System.out.println(":(");
        }
    }
}