import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String max = a.compareTo(b) < 0 ? a : b;
        String min = a.compareTo(b) >= 0 ? a : b;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(min); i++) {
            builder.append(max);
        }
        System.out.println(builder);
    }
}