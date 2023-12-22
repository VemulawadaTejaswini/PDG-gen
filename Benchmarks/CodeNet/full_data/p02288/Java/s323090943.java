
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int   n = sc.nextInt();
        
        // 二分ヒープ
        int[] h = new int[n+1];
        
        h[0] = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        
        // 最大ヒープを構築する。
        for (int i = n/2; i >= 1; i--) {
            maxHeapify(h, i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + h[i]);
        }
        System.out.println();
    }
    
    static void maxHeapify(int[] h, int idx) {
        int n = h.length - 1;
        int l = l(idx);
        int r = r(idx);
        // 左の子、自分、右の子で値が最大のノードを選ぶ
        int maxNodeIdx = 0;
        if (l <= n && h[l] > h[idx]) {
            maxNodeIdx = l;
        } else {
            maxNodeIdx = idx;
        }
        if (r <= n && h[r] > h[maxNodeIdx]) {
            maxNodeIdx = r;
        }
        // 子の方が値が大きい場合
        if (maxNodeIdx != idx) {
            int temp = h[idx];
            h[idx]        = h[maxNodeIdx];
            h[maxNodeIdx] = temp;
            maxHeapify(h, maxNodeIdx);
        }
    }
    
    static int l(int i) {
        return 2*i;
    }
    static int r(int i) {
        return 2*i + 1;
    }
}

