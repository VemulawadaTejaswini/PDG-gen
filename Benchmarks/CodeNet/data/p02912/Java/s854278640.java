import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //品数
        int M = sc.nextInt(); // 商品券の枚数

        long[] prices = new long[N]; // ねだん
        for (int i = 0; i < N; i++) {
            prices[i] = sc.nextLong();
        }
        Arrays.sort(prices);

        List<Long> are = LongStream.rangeClosed(0, 30)
                .map(l -> (long) Math.pow(2, l))
                .mapToObj(Long::valueOf)
                .collect(Collectors.toList());

        int count = 0;
        loop: for (int i = 30; i >= 0; i--) {
            if (prices[N - 1] < are.get(i)) {
                continue;
            }
            
            for (int j = N - 1; j >= 0; j--) {
                
                if(prices[j] >= are.get(i)) {
                    prices[j] /= 2;
                    count++;
                }
                
                if (count >= M) {
                    break loop;
                }

            }
            Arrays.sort(prices);
        }
        System.out.println(Arrays.stream(prices).sum());
    }

}
