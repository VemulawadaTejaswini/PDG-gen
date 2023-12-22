import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            s = s + s;
            if (s.contains(target)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

