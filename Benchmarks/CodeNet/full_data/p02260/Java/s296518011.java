import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int count = selectionSort(A, N);
        for(int i = 0; i < N; i++){
            System.out.print(A[i]);
            if(i != N - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static int selectionSort(int[] A, int N){
        int count = 0;
        for(int i = 0; i < N; i++){
            boolean flag = false;
            int minj = i;
            for(int j = i; j < N; j++){
                if(A[j] < A[minj]){
                    minj = j;
                    flag = true;
                }
            }
            if(flag){
                count++;
            }
            int temp = A[i];
            A[i] = A[minj];
            A[minj] = temp;
        }
        return count;
    }
}

