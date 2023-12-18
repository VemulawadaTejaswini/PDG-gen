import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int k = scanner.nextInt();

        scanner.close();

        System.out.println(sub(s, k));

        // System.out.println(System.currentTimeMillis() - startTime);
    }

    private static String sub(String s, int k) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = (i + 1); j <= s.length(); j++) {
                String s1 = s.substring(i, j);
                if (!list.contains(s1)) {
                    list.add(s1);
                    continue;
                }
            }
        }
        Collections.sort(list);

        return list.get(k - 1);
    }
}