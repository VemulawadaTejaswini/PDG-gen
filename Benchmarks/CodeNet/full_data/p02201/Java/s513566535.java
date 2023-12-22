import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String target = "E869120";
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (target.equals(sc.next())) {
                count++;
            }
        }
        System.out.println(count);
    }
}

