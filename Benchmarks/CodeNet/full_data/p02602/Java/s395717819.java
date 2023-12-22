import java.util.*;
public class Main {
    
    static int[] g = null;
    static int[] pro = null;
    
    static int prod(int l, int r){
        int p = 1;
        while(l<=r) p*=g[l++];
        return p;
    }
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int K = sc.nextInt();
        int NOC = N;
        int i = 0; int j = 0; int prev = -1;
        g = new int[N];
        pro = new int[(N-K)+1];
        while(NOC-->0) g[i++] = sc.nextInt();
        NOC = N-K;
        int p = prod(0,K-1);
        for(i=0; i<N-K; i++){
            pro[i]=p;
            if(i>0) System.out.println((p>pro[i-1])? "Yes" : "No");
            p=(p/g[i])*g[i+K];
        }
        pro[i]=p;
        System.out.println((pro[i]>pro[i-1])? "Yes" : "No");
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}
