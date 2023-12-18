import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "";
        if ((b - a - 1) % 2 == 1) {
            ans = "Alice";
        } else {
            ans = "Borys";
        }
        
        System.out.println(ans);
    }
}
