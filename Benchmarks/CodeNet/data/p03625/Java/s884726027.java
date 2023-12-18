import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A);
        int[] K = new int[N];
        int index = 0;
        int index_k = 0;
        while(index < N-1){
            if(A[index] == A[index+1]){
                if(K[index_k] != A[index]){
                    index_k++;
                    K[index_k] = A[index];
                }
                index += 2;
            }else{
                index++;
            }
        }
        Arrays.sort(K);
        long result = K[N-1] * K[N-2];
        System.out.println(result);

    }

}