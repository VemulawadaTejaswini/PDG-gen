import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int x=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<N;i++){
            x=x-a[i];
            if(x<0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(x==0?N:N-1);
    }
}
