import java.util.*;

public class Main {
    public static void main(String[] args) {
        call(new Scanner(System.in).nextInt());
    }
    private static void call(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 10 == 3)
                sb.append(' ').append(i);
        }
        System.out.println(sb);
    }
}

