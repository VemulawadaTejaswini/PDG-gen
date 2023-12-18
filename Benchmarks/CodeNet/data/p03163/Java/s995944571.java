import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int w[] = new int[n];
        int v[] = new int[n];
        for(int i=0;i<n;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        System.out.println(solve(w,v,W));
    }
    static long ans = 0;
    public static long solve(int w[],int v[],int W){
        check(w,v,W,0,0);
        return ans;
    }
    static void check(int w[],int v[],int W,long value,int i){
        ans = Math.max(ans,value);
        if(i == w.length)
            return;
        check(w,v,W,value,i+1);
        if(w[i]<=W)
            check(w,v,W-w[i],value+v[i],i+1);
    }
}