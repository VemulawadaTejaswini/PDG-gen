import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        long ans = LongStream.rangeClosed(1, N)
                .filter(x -> x % 3 != 0)
                .filter(x -> x % 5 != 0)
                .sum();

        System.out.println(ans);

    }

}
