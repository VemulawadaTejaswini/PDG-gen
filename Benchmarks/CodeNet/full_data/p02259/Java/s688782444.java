import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        int count = 0;
        int flag = 1;
        int tmp;

        while (flag != 0) {
            flag = 0;
            for(int j = N - 1; j > 0; j--) {
                if(A[j] < A[j-1]) {
                    tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                    flag = 1;
                    count++;
                }
            }
        }
        System.out.print(A[0]);
        for(int i = 1; i < N; i++)
            System.out.print(" " + A[i]);
        System.out.println("");
        System.out.println(count);
    }
}
