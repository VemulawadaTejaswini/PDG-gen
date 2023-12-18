
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A); // 昇順

        int[] B = new int[N];
        if (N == 3) {
            B[1] = A[0];
            B[2] = A[1];
            B[0] = A[2];
        } else {
            int temp;
            int min;
            int max;
            int prev;
            int loop;
            if (N%2 == 0) {
                // 偶数
                temp = N/2;
                loop = temp;
                min = loop - 1;
            } else {
                // 奇数
                temp = N/2;
                if (temp % 2 == 0) {
                    loop = N / 2;
                    min = loop;
                    loop++;
                } else {
                    loop = (int) Math.ceil((float)N/(float)2);
                    min = loop - 2;
                }
            }
            max = min;
            B[min] = A[0];
            prev = min;
            for (int i = 1; i < loop; i++) {
                if (min == prev) {
                    max += 2;
                    B[max] = A[i];
                    prev = max;
                } else {
                    min -= 2;
                    B[min] = A[i];
                    prev = min;
                }
            }

            if (N%2==0) {
                // 偶数
                min = temp;
                loop = (int) Math.ceil((float)N/(float)2);
            } else {
                // 奇数
                if (temp % 2 == 0) {
                    min = N/2 + 1;
                    loop = (int) Math.floor((float)N/(float)2);
                } else {
                    min = N/2;
                    loop = N / 2;
                }
            }
            max = min;
            B[min] = A[A.length - 1];
            prev = max;
            for (int i = 1; i < loop; i++) {
                if (max == prev) {
                    min -= 2;
                    B[min] = A[A.length - 1 - i];
                    prev = min;
                } else {
                    max += 2;
                    B[max] = A[A.length - 1 - i];
                    prev = max;
                }
            }
        }

        long result = 0;
        for (int i = 0; i < B.length-1; i++) {
            result += Math.abs(B[i] - B[i+1]);
        }
        System.out.println(result);
    }

}
