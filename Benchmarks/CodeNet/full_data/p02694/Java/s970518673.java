import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long b = 100;
        int out = 0;
        while(b < x){
            b *= 1.01;
            out++;
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
