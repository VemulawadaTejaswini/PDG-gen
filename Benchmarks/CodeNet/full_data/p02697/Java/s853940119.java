import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        HashSet<Integer> set = new HashSet<>();
        boolean subOne = false;
        for (int i = 0; i < M; i++) {
            int left = i;
            if (set.contains(N - 1 - i - i) || set.contains(i + N - (N - 1 - i))) {
                subOne = true;
            }
            int right = N - 1 - i - (subOne ? 1 : 0);
            System.out.println((left + 1) + " " + (right + 1));
            set.add(right - left);
            set.add(left + N - right);
        }
        System.out.println(set.size() == M * 2);
    }
}