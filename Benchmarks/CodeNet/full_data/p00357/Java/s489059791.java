import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] lefts = new boolean[n];
        int leftmax = 0;
        lefts[0] = true;
        for (int i = 0; i < n && leftmax < n - 1; i++) {
            if (lefts[i]) {
                for (int j = leftmax + 1; j - i <= arr[i] / 10 && j < n; j++) {
                    lefts[j] = true;
                    leftmax = j;
                }
            }
        }
        boolean[] rights = new boolean[n];
        int rightmin = n - 1;
        rights[n - 1] = true;
        for (int i = n - 1; i >= 0 && rightmin > 0; i--) {
            if (rights[i]) {
                for (int j = rightmin - 1; i - j <= arr[i] / 10 && j >= 0; j--) {
                    rights[j] = true;
                    rightmin = j;
                }
            }
        }
        if (lefts[n - 1] && rights[0]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

