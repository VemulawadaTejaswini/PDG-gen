import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int N = scan.nextInt();
        int[] arr = new int[N+1];
        arr[0] = scan.nextInt();
        for (int i=1;i<=N;i++) arr[i] = scan.nextInt();
        Task tsk = new Task();
        System.out.println(tsk.solve(arr));
    }

    static class Task{
        public int solve(int[] arr){
            Arrays.sort(arr);
            int num = arr[1] - arr[0];
            for (int i=2;i<arr.length;i++) {
                if (arr[i] != arr[i-1]) {
                    num = gcd(num, arr[i] - arr[i-1]);
                }
            }
            return num;
        }


        private int gcd(int x, int y) {
            if (y != 0) return gcd(y, x%y);
            return x;
        }
    }
}
