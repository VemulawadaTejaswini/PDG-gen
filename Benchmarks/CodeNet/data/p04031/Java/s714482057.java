import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        int ab=0;
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            ab+=a[i];
        }
        if(ab%N==0){
        ab=ab/N;
        }else{
            ab=ab/N+1;
        }
        long ans=0;
        for(int i=0;i<N;i++){
            ans+=(long)Math.pow(a[i]-ab,2);
        }
        long an1=0;
        ab--;
        for(int i=0;i<N;i++){
            an1+=(long)Math.pow(a[i]-ab,2);
        }
        System.out.println(Math.min(an1,ans));
    }
}
