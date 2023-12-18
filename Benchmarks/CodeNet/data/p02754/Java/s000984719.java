import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        if (n <= a + b || a == 0){
            System.out.println(Math.min(n, a));
        }
        else {
            if (n % (a+b) <= a){
                System.out.println(n/(a + b) * a + n % (a+b));
            }else
                System.out.println(n/(a + b) * a + a);
        }
    }
}
