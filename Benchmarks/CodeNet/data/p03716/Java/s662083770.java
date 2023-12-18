import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 入力 */
        int N = sc.nextInt();
        long[] a = new long[3*N];
        for(int i = 0; i < 3*N; i++) {
            a[i] = sc.nextLong();
        }
        //leftMax[i] :: = a[0]~a[i]までから大きい順にN要素を足し合わせた和の値
        //定義域は i<-[N-1, 2*N-1]
        long[] leftMax = new long[3*N];
        //rightMin[i] :: = a[i] ~ a[3*N-1]までから小さい順にN要素を足し合わせた和の値
        //定義域は i<-[N-1, 2*N-1]
        long[] rightMin = new long[3*N];
        //leftMaxを求める
        long sumLeft = 0;
        PriorityQueue qL = new PriorityQueue();
        //まずleftMax[N-1]を求める
        for(int i = 0; i < N; i++) {
            sumLeft += a[i];
            qL.add(a[i]);
        }
        leftMax[N-1] = sumLeft;
        //priority queueを更新しながらleftMaxを埋めていく
        //1回にlog NよりN log Nのオーダー
        for(int i = N; i < 2*N; i++) {
            sumLeft += a[i];
            qL.add(a[i]);
            long minimumValue = (long) qL.poll();
            sumLeft -= minimumValue;
            leftMax[i] = sumLeft;
        }
        //同様にrightMinを求める
        //大きいほうから吐き出してほしいので、queueに入れる時に符号を変える（comparatorを使う方法もある）
        long sumRight = 0;
        PriorityQueue qR = new PriorityQueue();
        for(int i=3*N-1; i >= 2*N; i--) {
            sumRight += a[i];
            qR.add(-a[i]); //符号を変えておく
        }
        rightMin[2*N] = sumRight;
        // System.out.println(rightMin[2*N]);
        for(int i=2*N-1; i>=N; i--) {
            sumRight += a[i];
            qR.add(-a[i]);
            long maximumValue = (long) qR.poll();
            maximumValue *= -1;
            sumRight -= maximumValue;
            rightMin[i] = sumRight;
        }
        //解を求める
        //i = N-1 ~ 2*N-1まで走査して、leftMax[i] - rightMin[i+1]の最大値が解となる。
        //-INFとして適切な値は？→制約から|a| <= 10**9なので、-10**9 * 10**5 * 3にしておけばよさそう
        long answer = -3*10*17;
        for(int i = N-1; i < 2*N; i++) {
            /*debug
            System.out.print(i);
            System.out.print(",");
            System.out.print(leftMax[i]);
            System.out.print(",");
            System.out.println(rightMin[i+1]);
            */
            answer = Math.max(leftMax[i] - rightMin[i+1], answer);
        }
        
        System.out.println(answer);
        /*debug
        System.out.println("rightMin");
        for(int i=0; i<3*N; i++) {
            System.out.print(i);
            System.out.print(",");
            System.out.println(rightMin[i]);
        }
        */
    }
}
