import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] k = new int[11];
        int[] s = new int[11];
        int[] p = new int[11];
        for(int i = 1; i <= M; i++) {
            k[i] = stdIn.nextInt();
            for(int j = 1; j <= k[i]; j++) {
                // s={1,2}を「11」、s={2}を「10」、s={1,3}を「101」に変換する
                // 2進数表記をフラグに見立てている
                s[i] |= 1 << (stdIn.nextInt() - 1);
                // 「<<」はシフト演算子
                // 「1<<0」は2進数「1」、「1<<1」は2進数「10」、「1<<2」は2進数「100」
                // 「|=」は論理演算子
                // 「001 | 101」は「001」、「111 | 010」は「010」
            }
        }
        for(int i = 1; i <= M; i++) {
            p[i] = stdIn.nextInt();
        }

        int cnt = 0;
        // スイッチのオン・オフの組み合わせは2のN乗個ある
        // すべてについて網羅的に調べる
        for(int i = 0; i < Math.pow(2, N); i++) {
            boolean lightAll = true;
            for(int j = 1; j <= M; j++) {
                // オンのスイッチの個数を2で割った余りがpに等しいかどうか
                lightAll &= Integer.bitCount(i & s[j]) % 2 == p[j];
                // iはスイッチオン・オフの組み合わせを表す
                // i=0(10進数)=00(2進数)、i=1(10)=01(2)、i=2(10)=10(2)、i=3(10)=11(2)
                // s[j]は電球jにつながっているスイッチを表す
                // スイッチ{1,2}がつながっているならs[j]=11(2進数)=3(10進数)
                // 「i & s[j]」は電球jにつながるスイッチのうちオンのものを表す
                // bitCountは2進数表記の「1」の個数、つまりオンのスイッチの個数を返す
            }
            if(lightAll) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}