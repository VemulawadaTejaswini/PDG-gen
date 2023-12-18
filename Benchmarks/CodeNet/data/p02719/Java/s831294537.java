import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Integer K = sc.nextInt();
        while (N >= K) {
            N = Math.abs(N-K);
        }
        System.out.println(N);
    }

}
