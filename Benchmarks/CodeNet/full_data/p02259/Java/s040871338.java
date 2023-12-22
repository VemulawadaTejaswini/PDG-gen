import java.util.Scanner;

public class Main{

    static int bubblesort(int A[],int N){
        int count = 0;
        for (int i = 0; i<N-1;i++){
            for (int j = 0; j<N-i-1;j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }

  static void printArray(int A[],int N){
        for (int i = 0; i<N;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int N = scanner.nextInt();
        int A[] = new int[100];
        for (int i = 0; i<N;i++)
        {
            A[i] = scanner.nextInt();
        }
        count = bubblesort(A,N);
        if (count == 0)
        {
            printArray(A,N);
        }
        else
        {
            printArray(A,N);
            System.out.print(count);
        }
    }
}

