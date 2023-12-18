import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        if(A[0]==0){
            System.out.println(Math.abs(K-A[A.length-1]+A[A.length-2]));
        }else{
            System.out.println(Math.abs(A[A.length-1]-A[0]));
        }
    }
}