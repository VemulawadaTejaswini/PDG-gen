import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, i -> sc.nextInt());
        Arrays.sort(array);
        ArrayDeque<Integer> minDeque = new ArrayDeque<>();
        ArrayDeque<Integer> maxDeque = new ArrayDeque<>();
        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                minDeque.addFirst(array[i]);
            } else {
                minDeque.add(array[i]);
            }
        }
        boolean isOdd = true;
        for (int i = n - 1; i >= n / 2; i--) {
            if (isOdd) {
                maxDeque.add(array[i]);
            } else {
                maxDeque.addFirst(array[i]);
            }
            isOdd = !isOdd;
        }
        int[] dest = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                dest[i] = minDeque.isEmpty() ? maxDeque.pop() : minDeque.pop();
            } else {
                dest[i] = maxDeque.pop();
            }
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += Math.abs(dest[i + 1] - dest[i]);
        }
        int edge = Math.abs(dest[n - 2] - dest[n - 1]);
        int change = Math.abs(dest[0] - dest[n - 1]);
        if (change > edge) {
            ans += change - edge;
        }
        int[] reverseDest = new int[n];
        System.arraycopy(dest, 0, reverseDest, 0, n);
        for (int i = 0; i < n - 1; i += 2) {
            reverseDest[i + 1] = dest[i];
            reverseDest[i] = dest[i + 1];
        }
        long reverse = 0;
        for (int i = 0; i < n - 1; i++) {
            reverse += Math.abs(reverseDest[i + 1] - reverseDest[i]);
        }
        edge = Math.abs(reverseDest[n - 2] - reverseDest[n - 1]);
        change = Math.abs(reverseDest[0] - reverseDest[n - 1]);
        if (change > edge) {
            reverse += change - edge;
        }
        ans = Math.max(ans, reverse);
        reverse = 0;
        System.arraycopy(dest, 0 , reverseDest, 0, n);
        for (int i = n - 1; i >= 1; i -= 2) {
            reverseDest[i] = dest[i - 1];
            reverseDest[i - 1] = dest[i];
        }
        for (int i = 0; i < n - 1; i++) {
            reverse += Math.abs(reverseDest[i + 1] - reverseDest[i]);
        }
        edge = Math.abs(reverseDest[n - 2] - reverseDest[n - 1]);
        change = Math.abs(reverseDest[0] - reverseDest[n - 1]);
        if (change > edge) {
            reverse += change - edge;
        }

        System.out.println(Math.max(reverse, ans));
    }
}