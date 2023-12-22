import java.util.*;

class Main{

    int n, max;
    int[] S, color;
    HashSet<Integer> set;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            if(n==0) break;

            int[] x = new int[n], y = new int[n], r = new int[n];
            color = new int[n];
            for(int i=0; i<n; i++){
                x[i] = sc.nextInt(); y[i] = sc.nextInt();
                r[i] = sc.nextInt(); color[i] = sc.nextInt();
            }
            S = new int[n];
            for(int i=0; i<n; i++){
                int T = 0;
                for(int j=0; j<i; j++){
                    if(i==j) continue;
                    int dist = (x[i]-x[j]) * (x[i]-x[j]) + (y[i]-y[j]) * (y[i]-y[j]);
                    int hankei = (r[i]+r[j]) * (r[i]+r[j]);
                    if(dist<hankei) T = T | (1<<j);
                }
                S[i] = T;
            }

            max = 0;
            set = new HashSet<Integer>();
            rec((1<<n)-1);
            System.out.println(max);
        }
    }

    void rec(int T){
        if(!set.add(T)) return;
        else max = Math.max(max, n - Integer.bitCount(T));
        for(int i=0; i<n; i++){
            if((T&(1<<i))==0 || (S[i]&T)!=0) continue;
            for(int j=i+1; j<n; j++){
                if((T&(1<<j))==0 || (S[j]&T)!=0) continue;
                if(color[i]==color[j]){
                    int newT = T;
                    newT ^= (1<<i); newT^= (1<<j);
                    rec(newT);
                }
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}