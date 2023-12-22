import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++){
            A[i] = Integer.parseInt(line[i]);
        }
        int k = 0;
        for (int i = 0; i < n; i++){
            if (k < A[i]){
                k = A[i];
            }
        }
        countingSort(A, B, k);
        System.out.println(formatAns(B));
    }
    public static void countingSort(int[] A, int[] B, int k){
        int n = A.length;
        
        int[] C = new int[k + 1];
        /*
        for (int i = 0; i <= k; i++){
            C[i] = 0;
        }
        */
        for (int j = 0; j < n; j++){
            C[A[j]]++;
        }
        for (int i = 1; i < k + 1; i++){
            C[i] = C[i] + C[i - 1];
        }
        for (int j = n - 1; j >= 0; j--){
            B[C[A[j]]-1] = A[j];
            C[A[j]]--;
        }
    }
    public static String formatAns(int[] B){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < B.length; i++){
            sb.append(B[i]);
            if (i == B.length - 1){
                break;
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}