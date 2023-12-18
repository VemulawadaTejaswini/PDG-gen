
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        char c = s.charAt(k-1);
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == c) {
                System.out.print(c);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
