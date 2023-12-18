import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for (int i = 1; i < n; i++) {
            a ^= sc.nextInt();
        }
        if (a == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}