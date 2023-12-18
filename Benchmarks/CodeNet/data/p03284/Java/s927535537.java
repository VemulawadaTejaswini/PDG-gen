import java.util.*;
public class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double K = sc.nextDouble();
        System.out.println((int)Math.ceil(N/K - Math.floor(N/K)));
    }
}