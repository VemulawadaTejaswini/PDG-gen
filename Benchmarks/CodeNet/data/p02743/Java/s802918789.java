import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double A = Math.sqrt(a);
        double B = Math.sqrt(b);
        double C = Math.sqrt(c);
        
        if(A + B < C){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}