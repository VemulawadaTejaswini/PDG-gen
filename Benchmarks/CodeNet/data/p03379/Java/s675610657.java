import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        long[] X=new long[N];
        long[] X1=new long[N];
        long sum=0;
        for(int i=0;i<N;i++){
            X[i]=sc.nextLong();
            X1[i]=X[i];
        }
        Arrays.sort(X1);
        long ans=X1[N/2-1];
        for(int i=0;i<N;i++){
            if(X[i]>ans){
                System.out.println(X1[(N/2)-1]);
            }else{
                System.out.println(X1[(N/2)]);
            }
        }
        
    }
}