import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int b, r, g, c, s, t;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        b = sc.nextInt();
        r = sc.nextInt();
        g = sc.nextInt();
        c = sc.nextInt();
        s = sc.nextInt();
        t = sc.nextInt();
        if((b|r|g|c|s|t) == 0)return false;
        return true;
    }

    static void solve(){
        System.out.println(100 + b*15 + r*15 + (b*5+r*3)*15 + g*7 + c*2 - (b*5+r*3)*2 - (t-b*5-r*3-s)*3);
    }

}