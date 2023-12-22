import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int x = Math.min(N, B-1);

        int score = A*x/B;

        System.out.println(score);

        sc.close();
    }
}