import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a,b);
        max = Math.max(a+b, max+max-1);
        System.out.println(max);
    }
}