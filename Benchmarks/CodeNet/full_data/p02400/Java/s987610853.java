import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double  r = sc.nextDouble();
        double x = Math.PI;
        double area = r * r * x;
        double length = 2 * r * x;
        String kara = " ";
        System.out.printf("%.6f",area);
        System.out.print(kara);
        System.out.printf("%.6f",length);
        
    }
}
