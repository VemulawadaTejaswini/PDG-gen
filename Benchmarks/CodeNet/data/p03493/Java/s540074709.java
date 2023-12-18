import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        solve();
    }
}
