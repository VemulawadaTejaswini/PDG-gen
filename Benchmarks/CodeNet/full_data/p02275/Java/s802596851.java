import java.util.Scanner;

/**
 * Created by zhangrunfeng on 2/18/20
 */
public class Main {

    private int N;
    private final int K = 10005;
    private int[] arr;

    private int maxElement = -1;
    private int minElement = Integer.MAX_VALUE;

    private int[] C;

    public Main (Scanner sc) {
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        C = new int[K];
    }

    public int[] bucketSort() {
        for (int i = 0; i < N; i++) {
            C[arr[i]]++;
        }

        for (int k = 1; k < K; k++) {
            C[k] += C[k-1];
        }

        int[] resArr = new int[N+1];
        for (int i = N-1; i >= 0; i--) {
            resArr[C[arr[i]]] = arr[i];
            C[arr[i]]--;
        }

        return resArr;
    }

    public String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.append(arr[N]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        int[] resArr = m.bucketSort();
        String res = m.printArr(resArr);
        System.out.println(res);
    }
}
