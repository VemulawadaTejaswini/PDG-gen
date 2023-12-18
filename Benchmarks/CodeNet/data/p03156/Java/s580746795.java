import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int i = 0; i < n; i++) {
            int p = scan.nextInt();
            if(p <= a) c1++;
            else if(p <= b) c2++;
            else c3++;
        }
        System.out.println(Math.min(c1, Math.min(c2, c3)));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
