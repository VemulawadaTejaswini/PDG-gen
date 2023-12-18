import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder builder = new StringBuilder(s);
        int q = scanner.nextInt();

//        boolean asc = true;
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            if (query == 1) {
                builder = builder.reverse();
            } else if (query == 2) {
                int f = scanner.nextInt();
                String c = scanner.next();

                if (f == 1) {
                    builder.insert(0, c);
                } else {
                    builder.append(c);
                }
            }
        }
        System.out.println(builder.toString());
    }
}