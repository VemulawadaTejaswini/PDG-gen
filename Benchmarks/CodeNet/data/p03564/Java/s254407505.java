import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }


    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int K = cin.nextInt();
        int now = 1;
        for (int i = 0; i < N; i++){
            //2倍とKを足すのの、値が小さくなる方を採用する
            now = Math.min(now * 2, now + K);
        }
        System.out.println(now);
    }
}
