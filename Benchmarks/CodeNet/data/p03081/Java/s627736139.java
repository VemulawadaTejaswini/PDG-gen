import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();

        char[] t = new char[Q];
        char[] d = new char[Q];
        for (int i = 0; i < Q; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }

        int left = 0;
        char backwardChar = 'x';
        for (int i = Q - 1; i >= 0; i--) {
            if (left > s.length() - 1) {
                break;
            }

            if (s.charAt(left) == t[i]) {
                if (d[i] == 'L') {
                    left++;
                    backwardChar = t[i];
                }
            } else if (backwardChar == t[i]) {
                if (d[i] == 'R') {
                    left--;
                    if (left >= 0) {
                        backwardChar = t[i];
                    } else {
                        left = 0;
                        backwardChar = 'x';
                    }
                }
            }
        }

        int right = N - 1;
        backwardChar = 'x';
        for (int i = Q - 1; i >= 0; i--) {
            if (right < 0) {
                break;
            }

            if (s.charAt(right) == t[i]) {
                if (d[i] == 'R') {
                    right--;
                    backwardChar = t[i];
                }
            } else if (backwardChar == t[i]) {
                if (d[i] == 'L') {
                    right++;
                    if (right <= N - 1) {
                        backwardChar = t[i];
                    } else {
                        right = N - 1;
                        backwardChar = 'x';
                    }
                }
            }
        }

        int extinctionNums = Math.min(left + (N - 1 - right), N);
        out.println(N - extinctionNums);
    }
}