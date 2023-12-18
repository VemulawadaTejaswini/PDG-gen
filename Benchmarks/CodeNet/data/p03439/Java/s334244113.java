import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        solve2(sc, N);
    }

    private static void solve(Scanner sc, int N) {
        String leftVal, rightVal;

        System.out.println(0);
        leftVal = sc.next();
        if (leftVal.equals("Vacant")) return;

        System.out.println(N / 2);
        rightVal = sc.next();
        if (rightVal.equals("Vacant")) return;


        int left = 0;
        int right = N - 1;
        if (leftVal.equals(rightVal)) {
            right = N / 2;
        } else {
            leftVal = rightVal;
            left = N / 2;
        }


        System.err.println(left + ", " + right);
        while (right - left > 1) {
            int mid = (right + left) / 2;
            if (left == mid) {
                mid = right;
            }
            System.out.println(mid);

            String input = sc.next();
            if (input.equals("Vacant")) {
                return;
            }

            if ((mid - left + 1) % 2 == 0) {
                if (input.equals(leftVal)) {
                    left = mid;
                    leftVal = input;
                } else {
                    if (left == mid) break;
                    right = mid;
                    rightVal = input;
                }
            } else {
                if (input.equals(leftVal)) {
                    if (left == mid) break;

                    right = mid;
                    rightVal = input;
                } else {
                    left = mid;
                    leftVal = input;
                }

            }
        }

        System.out.println(right % N);
        String input = sc.next();
        if (!input.equals("Vacant")) {
            System.exit(1);
        }
    }

    private static void solve2(Scanner sc, int N) {
        System.out.println(0);
        String leftString = sc.next();
        if (leftString.equals("Vacant")) {
            return;
        }

        int left = 0;
        int right = N;
        while (true) {
            int mid = (left+right)/2;
            System.out.println(mid);
            String ans = sc.next();
            if (ans.equals("Vacant")) return;

            if ((mid-left+1)%2 == 0 && leftString.equals(ans)
                    || (mid-left+1)%2 != 0 && !leftString.equals(ans)) {
                right = mid;
            } else {
                leftString = ans;
                left = mid;
            }
        }
    }
}