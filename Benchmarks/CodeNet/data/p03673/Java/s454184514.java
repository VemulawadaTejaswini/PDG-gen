import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        solve(N,A);
    }
    static void solve(int N, int[]A){
        if(N%2==0){
            even(N,A);
        }else{
            odd(N,A);
        }
    }
    static void even(int N, int[]A){
        int [] B = new int [N];
        int k=0;
        for(int i=N-1; i>=0; i-=2){
            B[k] = A[i];
            k++;
        }
        for(int i=0; i<N; i+=2){
            B[k] = A[i];
            k++;
        }
        print(N,B);
    }
    static void odd(int N, int[]A){
        int [] B = new int [N];
        int k=0;
        for(int i=N-1; i>=0; i-=2){
            B[k] = A[i];
            k++;
        }
        for(int i=1; i<N; i+=2){
            B[k] = A[i];
            k++;
        }
        print(N,B);
    }
    static void print(int N, int[]B){
        for(int i=0; i<N; i++){
            System.out.print(B[i]);
            if(i!=N-1)System.out.print(" ");
        }
    }
}