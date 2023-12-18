import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

//        int cnt = 0;
//        for (int i = 1; i <= N; i++) {
//            if (String.valueOf(i).length() % 2 != 0) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);

        long cnt = IntStream.rangeClosed(1, N).filter(i -> String.valueOf(i).length() % 2 != 0).count();
        System.out.println(cnt);
    }
}
