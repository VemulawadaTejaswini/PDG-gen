import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[100];
        for(int i = 0; i < N; i++)
            A[i] = scanner.nextInt();

        int count = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < N - 1; i++){
                if(A[i] > A[i+1]){
                    int tmp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = tmp;
                    flag = true;
                    count++;
                }
            }
        }
        for(int i = 0; i < N; i++){
            System.out.print(A[i]);
            if(i != N-1) System.out.print(" ");
        }


        System.out.println("\n" + count);
    }
}

