import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int sumFirst = 0;
        int sumLast = 0;
        int middle = 1;
        if (N%2 == 0) {
            middle = N/2;
        } else {
            middle = (N - 1) /2;
        }
        for (int i = 0; i < middle; i++) {
            sumFirst += A[i];
        }
        for (int i = middle; i < N; i++) {
            sumLast += A[i];
        }
        int result = sumFirst - sumLast;
        if (result > 0) {
            System.out.println(sumFirst - sumLast);
        } else {
            System.out.println(sumLast - sumFirst);
        }
        
    }
}