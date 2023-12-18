import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char last = '\0';
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String w =  sc.next();

            if (last != '\0' && last != w.charAt(0)) {
                System.out.println("No");
                return;
            }
            if (set.contains(w)) {
                System.out.println("No");
                return;
            }
            set.add(w);
            last = w.charAt(w.length() -1);
        }
        System.out.println("Yes");
    }
}
