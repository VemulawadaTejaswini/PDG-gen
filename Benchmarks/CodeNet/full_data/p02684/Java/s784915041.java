import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Long K = sc.nextLong();
        sc.nextLine();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int loop = (int) (K % N);
        System.out.println(A[A[loop]]);

        sc.close();
    }
}