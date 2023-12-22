import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        double b = sc.nextDouble();
        sc.close();

        long res = (long)Math.floor(a*b);
        System.out.println(res);    
    }
}