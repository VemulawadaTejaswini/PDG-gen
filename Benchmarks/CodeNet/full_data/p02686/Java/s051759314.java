import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long l = 0, r = 0;
        PriorityQueue<int[]> lq = new PriorityQueue<>(Comparator.comparing(x -> x[1]));
        PriorityQueue<int[]> rq = new PriorityQueue<>(Comparator.comparing(x -> x[1]));
        for (int i = 0; i < N; i++) {
            String s = in.next();
            int left = 0, right = 0, tmp = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ')') {
                    if (tmp == 0) {
                        right++;
                    } else {
                        tmp--;
                    }
                } else {
                    tmp++;
                }
            }
            tmp = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == '(') {
                    if (tmp == 0) {
                        left++;
                    } else {
                        tmp--;
                    }
                } else {
                    tmp++;
                }
            }
            if (left == 0) r += right;
            else if (right == 0) l += left;
            else if (left > right) lq.add(new int[]{left, right});
            else rq.add(new int[]{left, right});
        }

        while (!lq.isEmpty()) {
            int[] poll = lq.poll();
            if (l < poll[1]) {
                System.out.println("Yes");
                return;
            } else {
                l = l - poll[1] + poll[0];
            }
        }

        while (!rq.isEmpty()) {
            int[] poll = rq.poll();
            if (r < poll[0]) {
                System.out.println("No");
                return;
            } else {
                r = r + poll[1] - poll[0];
            }
        }

        System.out.println(l == r ? "Yes" : "No");
    }
}
