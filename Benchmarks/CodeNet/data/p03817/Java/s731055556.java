import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long out = (x / 11) * 2;
        x %= 11;
        if(x > 6) out += 2;
        else if(x > 0) out++;
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
