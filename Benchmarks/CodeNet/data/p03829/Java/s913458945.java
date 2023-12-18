import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans=0;
        int Xb=sc.nextInt();;
        for(int i=1; i<N; i++){
            int X = sc.nextInt();
            int d = X-Xb;
            Xb=X;
            int t = Math.min(d*A,B);
            ans+=t;
        }
        System.out.println(ans);
    }
}