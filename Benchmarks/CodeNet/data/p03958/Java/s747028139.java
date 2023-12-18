import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(), T = sc.nextInt();
        int[] A = new int[T];
        for (int i=0;i<T;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = A[T-1];
        for (int i=T-2;i>=0;i--){
            M = Math.abs(M-A[i]);
            A[i] = M;
        }
        System.out.println(Math.max(A[0]-1, 0));
    }
}
