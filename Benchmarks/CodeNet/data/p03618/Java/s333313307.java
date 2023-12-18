import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        long[] count = new long[26];
        for (char ch : a.toCharArray()) {
            count[ch - 'a']++;
        }
        long ans = (a.length() * (a.length() - 1)) / 2 + 1;
        ans -= LongStream.of(count).map(v -> (v * (v - 1L)) / 2L).sum();
        System.out.println(ans);
    }
}