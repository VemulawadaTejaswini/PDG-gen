import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        // left -> right
        long leftSum = 0;
        int i = 0;
        while (2*leftSum < sum) {
            leftSum += A[i++];
        }
        // right -> left
        long rightSum = 0;
        i = N-1;
        while (2*rightSum < sum) {
            rightSum += A[i--];
        }
        System.out.println(Math.min(leftSum - (sum-leftSum), rightSum - (sum-rightSum)));
    }
}
