import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();


        int n = N/X;

        if (N % X > 0) {
            n++;
        }

        int result = n * T;
        System.out.println(result);


    }
}