import java.util.Scanner;
import java.util.Arrays;

// 解説通りのb→cを確定後、a→b,cで計算する方法
public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int[] a=new int[n];
        for(int i=0;i<n;i++)    a[i]=Integer.parseInt(sc.next());
        int[] b=new int[n];
        for(int i=0;i<n;i++)   b[i]=Integer.parseInt(sc.next());
        int[] c=new int[n];
        for(int i=0;i<n;i++)    c[i]=Integer.parseInt(sc.next());
        Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);
        
        // 各b[i]に対し、何個のcが選べるか
        // Arrays.binarySearchですが、全部ソートすることで実は計算量を落とせます。
        // 詳しくは以下のコードを読んで欲しいのですが、sはiがNのループを回る間に1回だけNのループを回るのでO(N+N)=O(N)です。
        int[] cnum=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            while(s<n&&b[i]>=c[s])  s++;
            cnum[i]=n-s;
        }
        // cnumの累積和
        long[] accum=new long[n+1];
        for(int i=n-1;i>=0;i--){
            accum[i]=accum[i+1]+cnum[i];
        }
        // accumを利用して、各a[i]に対し使用可能なb,cの組み合わせを足していく
        // これも同様の手法で行きます。
        long ret=0;
        s=0;
        for(int i=0;i<n;i++){
            while(s<n&&a[i]>=b[s])  s++;
            ret += accum[s];
        }
        System.out.println(ret);
    }
}
