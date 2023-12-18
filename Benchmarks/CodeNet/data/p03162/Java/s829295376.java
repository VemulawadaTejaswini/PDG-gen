import java.util.*;

public class Main {

    public static void main(String[] args) {
        Problems problems = new Problems();
        problems.problemC_Vacation();
    }
}

class Problems {
    static void problemC_Vacation() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] lastA = new int[N+1];
        int[] lastB = new int[N+1];
        int[] lastC = new int[N+1];
        lastA[0] = 0; lastB[0] = 0; lastC[0] = 0;
        for (int i = 0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();

            lastA[i+1] = Math.max(lastB[i]+A[i],lastC[i]+A[i]);
            lastB[i+1] = Math.max(lastA[i]+B[i],lastC[i]+B[i]);
            lastC[i+1] = Math.max(lastA[i]+C[i],lastB[i]+C[i]);
        }
        System.out.println(Math.max(lastA[N],Math.max(lastB[N],lastC[N])));
    }
}