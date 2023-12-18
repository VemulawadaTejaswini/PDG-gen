import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int out = 700;
        for(int i = 0; i < 3; i++) if(s.charAt(i) == 'o') out += 100;
        System.out.println(out);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
