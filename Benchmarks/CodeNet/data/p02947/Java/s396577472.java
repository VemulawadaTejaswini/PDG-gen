import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < words.length; i++) words[i] = in.next();

        Map<String, Integer> cnt = new HashMap<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            cnt.put(sorted, cnt.getOrDefault(sorted, 0) + 1);
        }
        long res = 0;
        for (Integer i : cnt.values())
            res += i * (i - 1) / 2;
        System.out.println(res);
    }
}
