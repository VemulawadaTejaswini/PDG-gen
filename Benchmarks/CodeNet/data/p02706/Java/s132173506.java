import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int N;
        int M;
        int i=0;
        int Sum=0;

       
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        M = scan2.nextInt();

        int[] A = new int[M];

        while (i < M) {
            Scanner scan3 = new Scanner(System.in);

            A[i] = scan3.nextInt();
            Sum = Sum + A[i];
            i = i + 1;
        }
    int Days=N-Sum;
        
        if (Days<0){System.out.println("-1");}
        
        else {System.out.println(Days);
        
    }
}