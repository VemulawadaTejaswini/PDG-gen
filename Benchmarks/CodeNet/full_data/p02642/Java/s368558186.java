import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = Integer.parseInt(scanner.next());
        var A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = Integer.parseInt(scanner.next());
        Arrays.sort(A);

        var A_MAX = A[N-1];

        boolean[] isP = new boolean[A_MAX+1];
        Arrays.fill(isP, true);

        int lastValue = 0;
        for(int i=0; i<N; i++) {
            if(!isP[A[i]]) continue;
            if(lastValue == A[i]) {
                isP[A[i]] = false;
                continue;
            }
            for(int j = 2; A[i]*j <= A_MAX ;j++)
                isP[A[i] * j] = false;
            lastValue = A[i];
        }

        int num = 0;
        for(int i=0; i<N; i++) {
            if(isP[A[i]])
                num++;
        }
        System.out.println(num);
    }
}