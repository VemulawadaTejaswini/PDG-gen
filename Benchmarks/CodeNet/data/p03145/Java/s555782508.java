import java.time.Year;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int a;
    static int b;
    static int c;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
    }
 

    /**
     * solver
     */
    static void solve(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        Collections.sort(l);

        int ans = l.get(0) * l.get(1) / 2;

        System.out.println(ans);
    }


    public static void main(String args[]) {

        input();

        solve();
    }
}
