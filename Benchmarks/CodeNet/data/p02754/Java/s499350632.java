import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int remain = N % (A + B);
        if (remain>A) {
            remain=A;
        }
        int num= N / (A + B);

        System.out.println((num*A+remain));

    }
}