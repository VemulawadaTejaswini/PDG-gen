import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A;
        A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int count = 0;
        int minj;
        for(int i = 0; i < N; i++){
            minj = i;
            for(int j = i; j < N; j++){
                if(A[j] < A[minj]){
                    minj = j;
                }
            }
            if(minj != i){
                int tmp = A[i];
                A[i] = A[minj];
                A[minj] = tmp;
                count++;
            }
        }
        for(int i = 0; i < N; i++){
            if(i != N-1){
                System.out.print(A[i]+" ");
            }
            else{
                System.out.println(A[i]);
            }
        }
        System.out.println(count);
    }
}
