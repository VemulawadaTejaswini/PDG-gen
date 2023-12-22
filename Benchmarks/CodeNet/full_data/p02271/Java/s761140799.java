import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            // System.out.println(A[i]);
        }

        int q = sc.nextInt();
        int m[] = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }

        String result;
        for (int i = 0; i < q; i++) {
            if(canSolve(m[i], 0, A)){
                result = "yes";
            }else{
                result = "no";
            }

            System.out.println(result);
        }

        sc.close();
    }

    public static boolean canSolve(int sum, int i, int[] A){
        int n = A.length;

        if(sum == 0){
            return true;
        }
        if(i >= n){
            return false;
        }
        boolean result = canSolve(sum, i+1, A) || canSolve(sum-A[i], i+1, A);
        return result;
    }

}
