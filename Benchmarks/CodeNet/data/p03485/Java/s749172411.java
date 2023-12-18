import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        double c = ((double)(a)+(double)(b))/2;
        long d = Math.round(c);
        System.out.println(d);
    }
}