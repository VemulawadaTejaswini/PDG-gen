import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Deque<int[]> stack = new ArrayDeque<int[]>();
            int n, s, time = 0;
            n = sc.nextInt();
            s = sc.nextInt();
            if (n == 0 && s == 0) break;
            else if (n > 10 || s > 45) time = 0;
            else if (n == 1) {
                if (0 <= s && s <= 9) time = 1;
                else time = 0;
            } else {
                int[] state = new int[n + 1];
                for (int j = 0; j <= s && j<= 9; j++) {
                    for (int i = 0; i < n + 1; i++) {
                        state[i] = 0;
                    }
                    state[0] = j;
                    state[n] = 1;
                    stack.add(state.clone());
                }

                while (stack.size() > 0) {
                    state = new int[n + 1];
                    state = stack.remove();

                    if (state[n] < n - 1) {
                        for (int i = state[state[n] - 1] + 1; i <= 9; i++) {
                            int[] temp = state.clone();
                            temp[temp[n]] = i;
                            temp[n]++;
                            int sum = sum(temp, n);
                            if (sum < s) stack.add(temp.clone());
                            else break;
                        }
                    } else {
                        for (int i = state[state[n] - 1] + 1; i <= 9; i++) {
                            int[] temp = state.clone();
                            temp[temp[n]] = i;
                            temp[n]++;
                            int sum = sum(temp, n);
                            if (sum == s) {
                                time += 1;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(time);

        }

    }

    public static int sum(int[] state, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += state[i];
        }
        return sum;
    }
}
