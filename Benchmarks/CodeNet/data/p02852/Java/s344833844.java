import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken()) + 1;
        int m = Integer.parseInt(st.nextToken());
        boolean[] bad = new boolean[n];
        int half = n/2 + 5;
        String string = in.readLine();
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == '1') {
                bad[i] = true;
            }
        }
        Queue<Integer> leftQ = new LinkedList<>();
        Queue<Integer> rightQ = new LinkedList<>();
        int[] leftDist = new int[n];
        int[] rightDist = new int[n];
        Arrays.fill(leftDist, (int)1e9);
        Arrays.fill(rightDist, (int)1e9);
        leftDist[0] = 0;
        rightDist[n-1] = 0;
        leftQ.offer(0);
        rightQ.offer(n-1);
        int[] parLeft = new int[n];
        int[] parRight = new int[n];
        parRight[n-1] = n-1;
        while (!leftQ.isEmpty() || !rightQ.isEmpty()) {
            if (!leftQ.isEmpty()) {
                int node = leftQ.poll();
                for (int i = node+1; i <= node+m; i++) {
                    if (i >= n) {
                        break;
                    }
                    if (bad[i]) {
                        continue;
                    }
                    if (leftDist[i] == (int)1e9) {
                        leftDist[i] = leftDist[node] + 1;
                        if (leftDist[i] <= half) {
                            leftQ.offer(i);
                            parLeft[i] = node;
                        }
                    } else {
                        if (leftDist[i] == leftDist[node] + 1) {
                            parLeft[i] = Math.min(parLeft[i], node);
                        }
                    }
                }
            }
            if (!rightQ.isEmpty()) {
                int node = rightQ.poll();
                for (int i = node-1; i >= node-m; i--) {
                    if (i < 0) {
                        break;
                    }
                    if (bad[i]) {
                        continue;
                    }
                    if (rightDist[i] == (int)1e9) {
                        rightDist[i] = rightDist[node] + 1;
                        if (rightDist[i] <= half) {
                            rightQ.offer(i);
                            parRight[i] = node;
                        }
                    } else {
                        if (rightDist[i] == rightDist[node] + 1) {
                            parRight[i] = Math.min(parRight[i], node);
                        }
                    }
                }
            }
        }

        int res = (int)1e9;

        for (int i = 0; i < n; i++) {
            int sum = leftDist[i] + rightDist[i];
            if (sum < res) {
                res = sum;
            }
        }

        if (res == (int)1e9) {
            System.out.println("-1");
            return;
        }

        int[] output = new int[res];
        Arrays.fill(output, (int)1e9);

        outer: for (int mid = 0; mid < n; mid++) {
            if (leftDist[mid] + rightDist[mid] == res) {
                int[] a = new int[res];
                Stack<Integer> stack = new Stack<>();
                for (int i = mid; i != 0; i = parLeft[i]) {
                    stack.push(i - parLeft[i]);
                }
                Queue<Integer> queue = new LinkedList<>();
                for (int i = mid; i != n - 1; i = parRight[i]) {
                    queue.offer(parRight[i] - i);
                }
                int count = 0;
                for (int i : stack) {
                    a[count] = i;
                    count++;
                }
                for (int i : queue) {
                    a[count] = i;
                    count++;
                }

                for (int i = 0; i < res; i++) {
                    if (output[i] < a[i]) {
                        continue outer;
                    }
                    if (a[i] < output[i]) {
                        output = a;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < res; i++) {
            if (i > 0) {
                System.out.print(' ');
            }
            System.out.print(output[i]);
        }
        System.out.print('\n');
    }


}
/*


 */