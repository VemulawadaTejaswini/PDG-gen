import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        for (int i = 1; i <= b; i++) {
            if (a == c || a + i == c) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}