import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Map<String, Long> cnt = new HashMap<>();
        String[] words = new String[N];

        for (int i = 0; i < words.length; i++) {
            String word = in.next();
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            cnt.put(sorted, cnt.getOrDefault(sorted, (long) 0) + 1);
        }

        long res = 0;
        for (Long i : cnt.values())
            res += i * (i - 1) / 2;
        System.out.println(res);
    }
}
