import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println((int)(a + Math.pow(a,2) + Math.pow(a,3)));
    }
}
