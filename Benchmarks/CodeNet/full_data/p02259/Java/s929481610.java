import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int count = bubbleSort(A, N);
        for(int i = 0; i < N; i++){
            System.out.print(A[i]);
            if(i != N - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static int bubbleSort(int[] A, int N){
        boolean flag = true;
        int count = 0;
        while(flag){
            flag = false;
            for(int i = N - 1; i > 0; i--){
                if(A[i] < A[i - 1]){
                    int temp = A[i];
                    A[i] = A[i - 1];
                    A[i - 1] = temp;
                    count++;
                    flag = true;
                }
            }
        }
        return count;
    }
}
