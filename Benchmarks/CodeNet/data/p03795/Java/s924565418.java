import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = n / 15;
        System.out.println(n * 800 - div * 200);
    }
}