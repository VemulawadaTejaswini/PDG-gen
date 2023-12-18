import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt() - 1;
        int out = 0;
        for(int i = 0; i < n; i++){
            if(a[a[i]] == i) out++;
        }
        System.out.println(out / 2);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
