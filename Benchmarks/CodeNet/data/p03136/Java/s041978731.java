import java.util.Scanner;
import java.util.stream.IntStream;
 
class Main {
    public static void main(String[] args) {
        // 入力
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] Ls = new int[N];
        for (int i = 0; i < N; i++) {
            Ls[i] = scan.nextInt();
        }

        // N角形が描けるか？
        int max = IntStream.of(Ls).max().orElse(0);
        int otherSum = IntStream.of(Ls).filter(l -> l != max).sum();

        // 出力
        System.out.println(max < otherSum ? "Yes" : "No");
    }
}