import java.util.*;

public class ABC054{
    static int[] a, b, c;
    static int n, ma, mb;
    static int opt=Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.next());
        ma=Integer.parseInt(sc.next());
        mb=Integer.parseInt(sc.next());
        a=new int[n];
        b=new int[n];
        c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(sc.next());
            b[i]=Integer.parseInt(sc.next());
            c[i]=Integer.parseInt(sc.next());
        }
        sc.close();
        int ans=search(0, 0, 0, 0);
        if(ans==Integer.MAX_VALUE) ans=-1;
        System.out.println(ans);
    }

    public static int search(int sumA, int sumB, int sumC, int st){
        if(sumC>=opt) return opt;
        if((sumA+a[st])*mb==(sumB+b[st])*ma){
            opt=Math.min(opt,sumC+c[st]);
            if(st==n-1) return opt;
            return Math.min(opt, search(sumA, sumB, sumC, st+1));
        }
        if(st==n-1) return opt;
        return Math.min(Math.min(opt,search(sumA, sumB, sumC, st+1)), search(sumA+a[st], sumB+b[st], sumC+c[st], st+1));
    }
}