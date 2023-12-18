import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] p = {'a', 'b', 'c'};
        int idx = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != p[idx]) idx = 0;
            else idx++;
            if (idx == 3) {
                idx = 0;
                count++;
            }
        }
        System.out.println(count);
    }
}