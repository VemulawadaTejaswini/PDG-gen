import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scan.next());
        int out = 0;
        while(s.length() > 1){
            int n = s.length();
            s.delete(n - 1, n);
            if(s.substring(0, n / 2).equals(s.substring(n / 2))){
                out = n;
            }
        }
        System.out.println(out - 1);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
