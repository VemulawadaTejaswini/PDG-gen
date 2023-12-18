import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];
        int[] X = new int[Q];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            X[i] = sc.nextInt();
        }
        final int[] backup = new int[N];
        System.arraycopy(A, 0, backup, 0, A.length);
        boolean choku = true;
        int chokudai = 0;
        for (int q = 0; q < Q; q++) {
            for (int i = 0; i < N; i++) {
                if (choku) {
                    chokudai += A[arrmax(A)];
                    //System.out.println("chokudai:" + A[arrmax(A)]);
                    A[arrmax(A)] = 0;
                } else {
                    //System.out.println("aoki:" + A[chikai(A, X[q])]);
                    A[chikai(A, X[q])] = 0;
                }
                choku = !choku;
            }
            System.out.println(chokudai);
            chokudai = 0;
            choku = true;
            System.arraycopy(backup, 0, A, 0, A.length);
        }
        sc.close();
    }

    static int arrmax(int[] arr) {
        Arrays.sort(arr);
        return arr.length - 1;
    }

    static int chikai(int[] arr, int X) {
        int chikai = 1000000000;
        int ans = 0;
        //System.out.println(X);
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + ",");
            int v = arr[i];
            if (Math.abs(chikai - X) > Math.abs(v - X) && v != 0) {
                chikai = v;
                ans = i;
            } else if (Math.abs(chikai - X) == Math.abs(v - X) && chikai > v && v != 0) {
                chikai = v;
                ans = i;
            }
        }
        return ans;

    }
}
