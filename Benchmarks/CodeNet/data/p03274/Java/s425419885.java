import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import static java.lang.Integer.*;
import static java.lang.Math.abs;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int K = parseInt(st.nextToken());
        int[] C = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            C[i] = parseInt(st.nextToken());
        }
        sort(C);
        int start = binarySearch(C, 0);

        PriorityQueue<Path> queue = new PriorityQueue<>(Comparator.comparingLong(Path::getLength));
        int left = start - 1;
        if (left >= 0) {
            queue.add(new Path(left, left, start, 1, diff(C[start], C[left])));
        }
        int right = start + 1;
        if (right <= N) {
            queue.add(new Path(right, start, right, 1, diff(C[start], C[right])));
        }
        long time = 0;
        while (queue.peek() != null) {
            if (queue.peek().counter == K) {
                time = queue.peek().getLength();
                break;
            }
            Path aPath = queue.poll();
            left = aPath.left - 1;
            if (left >= 0) {
                queue.add(new Path(left, left, aPath.right,
                        aPath.counter + 1, aPath.getLength() + diff(C[aPath.current], C[left])));
            }
            right = aPath.right + 1;
            if (right <= N) {
                queue.add(new Path(right, aPath.left, right,
                        aPath.counter + 1, aPath.getLength() + diff(C[aPath.current], C[right])));
            }
        }
        System.out.println(time);
    }

    private static class Path {
        final int left;
        final int right;
        final int current;
        final int counter;
        final long length;

        Path(int c, int l, int r, int cnt, long len) {
            current = c;
            left = l;
            right = r;
            counter = cnt;
            length = len;
        }

        long getLength() {
            return length;
        }
    }

    private static int diff(int a, int b) {
        if ((a > 0 && b > 0) || (a < 0 && b < 0)) return abs(a - b);
        else return abs(a) + abs(b);
    }
}