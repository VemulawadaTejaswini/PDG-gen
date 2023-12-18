import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Divide the Problems
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        System.out.println(sln(A));
        sc.close();
    }

    static int sln(int[] A) {
        int n = A.length / 2;
        Arrays.sort(A);
        return A[n] - A[n - 1];
    }
}
