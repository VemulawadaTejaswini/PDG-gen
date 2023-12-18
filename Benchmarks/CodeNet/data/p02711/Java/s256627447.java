import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        boolean ans = false;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 7) {
                ans = true;
                break;
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}