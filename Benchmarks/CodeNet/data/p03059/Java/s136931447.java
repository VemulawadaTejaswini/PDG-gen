import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer t = sc.nextInt();
        int w = t / a;
        System.out.println(w*b);
    }
}