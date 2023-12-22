import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long d = scan.nextInt();
        int out = 0;
        for(int i = 0; i < n; i++){
            long x = scan.nextLong();
            long y = scan.nextLong();
            if(x * x + y * y <= d * d) out++;
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
