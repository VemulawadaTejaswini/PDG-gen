import java.util.*;
import java.io.*;

public class Main {
    public static int calc(List<Integer> list){
        int A = list.size();
        int ans = 0;
        //p^74
        for(int i=0;i<A;i++){
            if(list.get(i)>=74) ans++;
        }
        //p^24 q^2, p^14 q^4
        for(int i=0;i<A;i++) for(int j=0;j<A;j++) if(i!=j){
            if(list.get(i)>=24 && list.get(j)>=2) ans++;
            if(list.get(i)>=14 && list.get(j)>=4) ans++;
        }
        //p^4 q^4 r^2 (p<q)
        for(int i=0;i<A;i++)for(int j=i+1;j<A;j++) for(int k=0;k<A;k++) if(i!=k && j!=k){
            if(list.get(i)>=4 && list.get(j)>=4 && list.get(k)>=2) ans++;
        }
        return ans;
    }


    public static int solve(int N){
        int[] primes = new int[101];
        for(int n=2; n<=N; n++){
            int m=n;
            int d=2;
            while(m>1){
                if(m%d==0){
                    m /= d;
                    primes[d]++;
                }else{
                    d++;
                }
            }
        }
        List<Integer> p = new ArrayList<>(25);
        for(int x: primes) if(x>0) p.add(x);



        return calc(p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solve(N));

    }
}