import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = Integer.parseInt(scanner.next());
        var A = new int[N];
        var isP = new boolean[N];

        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(scanner.next());
            isP[i] = true;
        }

        Arrays.parallelSort(A);
        int numP = 0;
        
        for(int i=0; i<N; i++) {
            if(!isP[i]) continue;
            
            for(int j=0; j<N; j++) {
                if(!isP[j]) continue;
                if(A[i] == A[j]) isP[i] = false;
                for(int multiply = 2*A[i]; multiply < A[j]; multiply += A[i]) {
                    if(A[j] == multiply) isP[j] = false;
                }
            }
            if(isP[i]) numP++;
        }
        System.out.println(numP);
    }
}