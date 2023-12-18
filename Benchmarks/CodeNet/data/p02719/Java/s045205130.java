import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Integer K = sc.nextInt();
        int count = 0;
        while (N <= K) {
            N = Math.abs(N-K);
            count++;
        }
        System.out.println(N);
    }

}
