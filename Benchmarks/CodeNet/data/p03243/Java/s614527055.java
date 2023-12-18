import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans=N/100;
        int A=ans*100+ans*10+ans;
        if(A>=N){
            ans=ans;
        }else{
            ans++;
        }
        for(int i=0;i<3;i++){
            System.out.print(ans);
        }
        System.out.println();
    }
}