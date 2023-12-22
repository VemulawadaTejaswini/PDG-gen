import java.util.Scanner;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int k = -1;
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
            k = Math.max(A[i],k);
        }
        int C[] = new int[k+1];
        for(int i = 0 ; i <= k ; i++)
            C[i] = 0;
        for(int i = 0 ; i < n ; i++)
            C[A[i]]++;
        for(int i = 1 ; i <= k ; i++)
            C[i] += C[i-1];
        for(int i = 0 ; i < n ; i++)
            B[(C[A[i]]--)-1] = A[i];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n-1 ; i++)
            sb.append(B[i] + " ");
        System.out.println(sb.append(B[n-1]));
    }
}
