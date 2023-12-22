import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int taka = c / b;
        if (c % b != 0) {
            taka++;
        }
        int ao = a / d;
        if (a % d != 0) {
            ao++;
        }
        
        if (taka <= ao) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}