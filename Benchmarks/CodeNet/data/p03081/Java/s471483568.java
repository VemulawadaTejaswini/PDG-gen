

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        String[] t = new String[q];
        String[] d = new String[q];
        for (int i = 0; i < q; ++i) {
            t[i] = scanner.next();
            d[i] = scanner.next();
        }
        // find left dropped maxIndex

        int leftDropMaxIndex = binarySearchLeftDrop(t, d, s, q);

        // find right dropped minIndex
        int rightDropMinIndex = binarySearchRightDrop(t, d, s, q);

        int leftDropNum =
                leftDropMaxIndex == -1 ? 0 : leftDropMaxIndex + 1;
        int rightDropNum =
                rightDropMinIndex == s.length() ? 0 : n - rightDropMinIndex;

        System.out.println((n - leftDropNum - rightDropNum));

    }

    public static int binarySearchLeftDrop(String[] t, String[] d, String s, int q) {
        int l = -1; // fit
        int r = s.length();
        while (r - l > 1) {
            int mid = (l + r) / 2;
            int dropped = isDropped(mid, t, d, s, q);
            if (dropped == 1) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static int binarySearchRightDrop(String[] t, String[] d, String s, int q) {
        int l = -1;
        int r = s.length(); // fit
        while (r - l > 1) {

            int mid = (l + r) / 2;
            int dropped = isDropped(mid, t, d, s, q);
            if (dropped == 2) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    public static int isDropped(int index, String[] t, String[] d, String s, int q) {
        int current = s.charAt(index) - 'A';
        int[] num = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            num[i] = 1;
        }

        for (int i = 0; i < q; ++i) {
            if (t[i].charAt(0) - 'A' != current) {
                continue;
            }

            if (d[i].equals("L")) {
                if (index == 0) {
                    return 1;
                }
                current = s.charAt(index - 1) - 'A';
                --index;
            } else {
                if (index == s.length() - 1) {
                    return 2;
                }
                current = s.charAt(index + 1) - 'A';
                ++index;
            }
        }
        return 0;
    }
}
