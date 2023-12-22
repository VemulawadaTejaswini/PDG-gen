import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        int c = (int)Math.round(100*b);
        System.out.println((long)(a*c)/100);
    }
}