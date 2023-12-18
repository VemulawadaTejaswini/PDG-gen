import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        if (x < a) {
            System.out.println("NO");
        } else if (a + b < x) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
