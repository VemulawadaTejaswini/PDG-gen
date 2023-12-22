import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        // ans: 二分木の頂点数の最大値(但し、深さiにA[i]個だけ葉がある)
        long ans = 0;
        
        // ・言い換え
        // 深さiにおける頂点数(count[i])の最大値を考える。
        
        // 下から見る時、頂点数はarray[i]個だけ増やせる
        // -> count[i] = sum[i] (arrayの後ろからの累積和)
        // 上から見る時、頂点数は葉を引いた数の2倍にできる
        // -> count[i] = (count[i-1] - array[i-1]) * 2
        // <- オーバーフローしそう。 (深さの最大値は10^5)
        // -> 上から見るのを都度、下からのmaxでカットしてやる。
        
        int n = sc.nextInt();
        // array[i]: 深さiの葉の個数
        int[] array = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            array[i] = sc.nextInt();
        }
        
        // sum[i]: 下から見たときのcount[i]の最大値
        long[] sum = new long[n+1];
        sum[n] = array[n];
        for (int i = n-1; i >= 0; i--) {
            sum[i] = sum[i+1] + array[i];
            
        }
        // System.out.println(Arrays.toString(sum));
        
        // count[i]: 深さiにおける頂点数
        long[] count = new long[n+1];
        count[0] = 1;
        for (int i = 1; i < n+1; i++) {
            long topdown = (count[i-1] - array[i-1]) * 2;
            long bottomup = sum[i];
            
            count[i] = Math.min(topdown, bottomup);
            if (count[i] < 0) {
                System.out.println(-1);
                return;
            }
        }
        
        for (int i = 0; i < n+1; i++) {
            ans += count[i];
        }
        System.out.println(ans);
        
    }
}