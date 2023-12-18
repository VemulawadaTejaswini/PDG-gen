import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int N;
        int M;
        int i = 0;
        int Sum = 0;


        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        M = scan.nextInt();

        int[] A = new int[M];

        while (i < M) {
           
            A[i] = scan.nextInt();
            Sum = Sum + A[i];
            i = i + 1;
        }
        int Days = N - Sum;

        if (Days < 0) {
            System.out.println("-1");
        } else {
            System.out.println(Days);

        }
    }
}
