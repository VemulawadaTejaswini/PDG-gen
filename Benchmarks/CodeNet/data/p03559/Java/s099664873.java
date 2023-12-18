import java.util.Scanner;
import java.util.Arrays;

// 別解（想定解）のb→axc解法
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
        
        // 各b[i]に対し、何個のcが選べるかx何個aが選べるか
        // これらは独立に計算が可能なので、掛け算して足していくと答えになります。
        // 解説した解法に載せたsを用いる手法を拡張して、s,tで同時に進めます。
        // aの処理が結構めんどくさいので頑張って。
        long ret=0;
        int s=0,t=-1;
        for(int i=0;i<n;i++){
            while(s<n&&c[s]<=b[i]) s++;
            while(t<n-1&&a[t+1]<b[i])   t++;
            ret+=(long)(n-s)*(t+1);
        }
        System.out.println(ret);
    }
}
