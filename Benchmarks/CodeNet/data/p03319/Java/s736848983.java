import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), k = sc.nextDouble();
        System.out.println((int)Math.ceil((n-k)/(k-1)) + 1);
    }
}