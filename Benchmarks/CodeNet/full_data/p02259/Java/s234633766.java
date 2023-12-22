import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = stdIn.nextInt();
        }
        int swapCount = 0;
        for(int i = 0; i < A.length -1; i++) {
            for(int j = A.length - 1; j > i; j--) {
                if(A[j - 1] > A[j]) {
                    int tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                    swapCount++;
                }
            }
        }
        String delimiter = "";
        for(int a : A) {
            System.out.print(delimiter + a);
            delimiter = " ";
        }
        System.out.println();
        System.out.println(swapCount);
    }
}
