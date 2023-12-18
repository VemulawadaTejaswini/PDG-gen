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
        Arrays.sort(b); Arrays.sort(c);
        
        // 各b[i]に対し、何個のcが選べるか
        int[] cnum=new int[n];
        for(int i=0;i<n;i++){
            int idx=Arrays.binarySearch(c,b[i])+1;
            if(idx<0)  idx*=-1;
            cnum[i] = n-idx;
        }
        // cnumの累積和
        long[] accum=new long[n+1];
        for(int i=n-1;i>=0;i--){
            accum[i]=accum[i+1]+cnum[i];
        }
        // accumを利用して、各a[i]に対し使用可能なb,cの組み合わせを足していく
        long ret=0;
        for(int i=0;i<n;i++){
            int idx=Arrays.binarySearch(b,a[i])+1;
            if(idx<0)   idx*=-1;
            ret += accum[idx];
        }
        System.out.println(ret);
    }
}
