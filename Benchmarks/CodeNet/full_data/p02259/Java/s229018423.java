import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int dummy;
        int count = 0;
        boolean unsorted = true;

        while(unsorted){
            unsorted = false;
            for (int i = N-1; i > 0; i--) {
                if(A[i] < A[i-1]){
                    dummy = A[i-1];
                    A[i-1] = A[i];
                    A[i] = dummy;

                    count++;
                    unsorted = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i]);
            if(i != N-1){
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println(count);

        sc.close();
    }
}
