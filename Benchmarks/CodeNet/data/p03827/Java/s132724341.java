import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int x = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (s.substring(i, i + 1).equals("I")) {
                x++;
                max = max < x ? x : max ;
            } else {
                x--;
            }
        }

        System.out.println(max);
    }
}
