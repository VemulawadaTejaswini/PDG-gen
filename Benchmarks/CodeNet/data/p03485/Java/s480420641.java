import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double i = (double)(A + B) / 2;
        int k = (int)(Math.ceil(i));
        System.out.println(k);
    }
}