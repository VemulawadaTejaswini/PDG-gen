
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> aTmp = new PriorityQueue<>();
        Queue<Integer> bTmp = new PriorityQueue<>();
        Queue<Integer> cTmp = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            aTmp.add(scan.nextInt());
        }
        for (int i = 0; i < N; i++) {
            bTmp.add(scan.nextInt());
        }
        for (int i = 0; i < N; i++) {
            cTmp.add(scan.nextInt());
        }
        int[] bWeight = new int[N];
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = aTmp.poll();
        }
        for (int i = 0; i < N; i++) {
            b[i] = bTmp.poll();
        }
        for (int i = 0; i < N; i++) {
            c[i] = cTmp.poll();
        }
        int aIndex = 0;
        for (int i = 0; i < N; i++) {
            for (; aIndex < N; aIndex++) {
                if (b[i] <= a[aIndex]) {
                    bWeight[i] = aIndex;
                    break;
                }
            }
            if (aIndex == N) {
                bWeight[i] = N;
            }
        }
        int cIndex = 0;
        for (int i = 0; i < N; i++) {
            if(b[i] < c[cIndex]) {
                bWeight[i] *= N - cIndex;
                continue;
            }
            for (;cIndex < N;cIndex++) {
                if (b[i] < c[cIndex]) {
                    bWeight[i] *= N - cIndex;
                    break;
                }
            }
        }

        System.out.println(IntStream.of(bWeight).sum());
    }
}