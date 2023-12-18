import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();

        int[] evenCount = new int[100001];
        int[] oddCount = new int[100001];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenCount[nums[i]]++;
            }
            else {
                oddCount[nums[i]]++;
            }
        }

        int evenMax1 = 0;
        int evenMax2 = 0;
        int oddMax1 = 0;
        int oddMax2 = 0;
        for (int i = 1; i <= 100000; i++) {
            if (evenCount[i] > evenMax1) {
                evenMax2 = evenMax1;
                evenMax1 = i;
            }
            else if (evenCount[i] > evenMax2) {
                evenMax2 = i;
            }

            if (oddCount[i] > oddMax1) {
                oddMax2 = oddMax1;
                oddMax1 = i;
            }
            else if (oddCount[i] > oddMax2) {
                oddMax2 = i;
            }
        }

        if (evenMax1 != oddMax1) {
            System.out.println(n - evenCount[evenMax1] - oddCount[oddMax1]);
        }
        else if (evenCount[evenMax2] >= oddCount[oddMax2]) {
            System.out.println(n - evenCount[evenMax2] - oddCount[oddMax1]);
        }
        else {
            System.out.println(n - evenCount[evenMax1] - oddCount[oddMax2]);
        }


        sc.close();
    }
}