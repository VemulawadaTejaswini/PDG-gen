import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        int out = 1;
        for(int i = 1; i < n; i++){
            boolean ok = true;
            for(int j = 0; j < i; j++){
                if(h[i] < h[j]) {
                    ok = false;
                }
            }
            if(ok) out++;
        }
        System.out.println(out);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}