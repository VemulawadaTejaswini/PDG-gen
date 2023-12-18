import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int N = scan.nextInt();
        int A = scan.nextInt();
        int[] arr = new int[N];
        int zerocnt = 0;
        for (int i=0;i<N;i++) {
            arr[i] = scan.nextInt() - A;
            if (arr[i] == 0) zerocnt++;
        }
        long base = 1L << zerocnt;
        if (zerocnt == N) {
            System.out.println(base - 1);
            return;
        }
        Task tsk = new Task();
        System.out.println(tsk.solve(arr, A) * base + (base-1));
    }

    static class Task{
        private int cnt = 0;
        public int solve(int[] arr, int A){
           dfs(arr, 0, 0);
           return cnt;
        }

        private void dfs(int[] arr, int i, int cur) {
            if (i == arr.length) return;
            dfs(arr, i+1, cur);
            if (arr[i] == 0) return;
            if (cur + arr[i] == 0) cnt++;
            dfs(arr, i+1, cur+arr[i]);
        }
    }
}
