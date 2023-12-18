import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int N;
    static String[] s;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        s = new String[N];
        for(int i=0;i<N;i++){
            s[i] = sc.next();
        }
        sc.close();
    }
 
    /**
     * solver
     */
    static void solve(){
        int ans;
        int ab = 0;
        int a=0;
        int b=0;

        for(int i=0;i<N;i++){
            ab += s[i].split("AB", -1).length - 1;
            if(s[i].charAt(0) == 'B'){
                b++;
            }
            if(s[i].charAt(s[i].length() - 1) == 'A') {
                a++;
            }
        }

        if (a == N && b == N) {
            ans = ab + a - 1;
        } else {
            ans = ab + Math.min(a,b);
        }

        System.out.println(ans);

    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
