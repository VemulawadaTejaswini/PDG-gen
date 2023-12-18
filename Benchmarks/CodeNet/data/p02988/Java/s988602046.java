import java.util.Scanner;

public class Main {
    //Ordinary Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        System.out.println(sln(A));
        sc.close();
    }

    static int sln(int[] A) {
        int n = A.length, res = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((A[i] <= A[i - 1] && A[i] <= A[i + 1]) || (A[i] >= A[i - 1] && A[i] >= A[i + 1])) continue;
            res++;
        }
        return res;
    }
}
