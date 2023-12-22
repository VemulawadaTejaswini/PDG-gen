import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = Integer.parseInt(scanner.next());
        int[] A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = Integer.parseInt(scanner.next());
        Arrays.sort(A);

        System.out.println("A: " + Arrays.toString(A));

        boolean[] isP = new boolean[A[N-1]+1];
        Arrays.fill(isP, true);

        for(int i=0; i<N; i++) {
            if(!isP[A[i]]) continue;

            int p = A[i];
            int multiply = p;
            for(int j=i+1; j<N; j++) {
                if(!isP[A[j]]) continue;

                if(A[i] == A[j]) {
                    isP[A[i]] = false;
                    isP[A[j]] = false;
                    continue;
                }
                while(multiply < A[j])
                    multiply += p;

                if(multiply == A[j])
                    isP[A[j]] = false;
            }
        }

        int num = 0;
        for(int i=0; i<N; i++) {
            if(isP[A[i]])
                num++;
        }
        System.out.println(num);
    }
}