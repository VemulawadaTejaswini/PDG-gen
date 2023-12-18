import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[][] P;
    int[] A;
    int N,M,Q;

    public Main(){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        Q = scanner.nextInt();

        P = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            P[i][0] = scanner.nextInt()-1;
            P[i][1] = scanner.nextInt()-1;
            P[i][2] = scanner.nextInt();
            P[i][3] = scanner.nextInt();
        }

        A = new int[N+1];
        Arrays.fill(A, 1);
        A[N] = M;

        System.out.println(search(N-1));
    }

    int search(int index){
        if(index < 0){
            int points = 0;
            for (int i = 0; i < Q; i++) {
                if (A[P[i][1]] - A[P[i][0]] == P[i][2]) points += P[i][3];
            }
            return points;
        }
      
        if(A[index] > A[index+1]) return 0;

        int V1, V2;
        A[index] += 1;
        V1 = search(index);
        A[index] -= 1;
        V2 = search(index-1);

        return Math.max(V1, V2);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
