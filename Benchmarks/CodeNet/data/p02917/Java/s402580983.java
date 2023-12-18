import java.util.Scanner;

public class Main {
    public static int min(int a, int b){
        if(a>b){
            return b;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] B = new int[N-1];
        for(int i = 0; i < N-1; i++){
            B[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < N; i++){
            if(i == 0){A[i] = B[i];}
            else if(i == N-1){A[i] = B[i-1];}
            else{
                A[i] = min(B[i],B[i-1]);
            }
        }
        int total = 0;
        for(int i = 0; i < N; i++){
            total += A[i];
        }
        System.out.println(total);
    }
}