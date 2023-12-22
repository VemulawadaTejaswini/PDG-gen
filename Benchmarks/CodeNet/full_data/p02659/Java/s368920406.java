import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(a * b);
        double result = a * b;

        System.out.println((long)Math.floor(result));
    }
}
