import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int Y = cin.nextInt();

        // 10000円札を0枚からN枚まで全探索する
        for (int A = 0; A <= N; A++){
            // 5000円札を0枚から8枚まで全探索する
            for (int B = 0; B <= Math.min(N - A, 8); B++){
                // 1000円札の枚数を計算する
                int C = N - A - B;
                int Money = 10000 * A + 5000 * B + 1000 * C;
                // 枚数はN枚なので、金額だけ見れば良い。
                if(Money == Y){
                    System.out.println(A + " " + B + " " + C);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
