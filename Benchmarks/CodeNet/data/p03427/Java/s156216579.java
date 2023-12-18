import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = count(n);
        String t = String.valueOf(n);
        if (t.length() == 1) {
            System.out.println(n);
            return;
        }
        int head = Character.getNumericValue(t.charAt(0)) - 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < t.length() - 1; i++) {
            builder.append("9");
        }
        if (head > 0) {
            builder.insert(0, head);
        }
        System.out.println(Math.max(count, count(Long.parseLong(builder.toString()))));
    }

    private static int count(long v) {
        int count = 0;
        while (v > 0) {
            count += v % 10;
            v /= 10;
        }
        return count;
    }
}