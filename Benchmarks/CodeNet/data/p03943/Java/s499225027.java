import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        if (a == b + c) {
            System.out.print("Yes");
        } else if (b == c + a) {
            System.out.print("Yes");
        } else if (c == a + b) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

        sc.close();
    }
}