import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int a = A;
        int b = B * 0;
        int c = C * -1;

        int sum1 = A + B + C;
        int sum2 = a + b+ c;
        int sum3 = sum1 + sum2;

        int result = sum3 - K;


        System.out.println(result);



    }
}