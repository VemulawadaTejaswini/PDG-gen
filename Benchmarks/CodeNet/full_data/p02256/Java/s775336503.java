import java.util.Scanner;

/**
 * Gcm
 */
public class Main {

    public static void main(String[] args) {
        new Main().solveGcm();
    }

    void solveGcm(){

        final int INF = 10^9;
        int x,y;

        Scanner sc = new Scanner(System.in);
        x = Integer.parseInt(sc.next());
        y = Integer.parseInt(sc.next());
        sc.close();

        int smaller, mod, dump;

        if(x <= y){
            smaller = x;
            mod = y % x;
        }
        else{
            smaller = y;
            mod = x % y;
        }

        while (mod > 0) {
            dump = smaller;
            smaller = mod;
            mod = dump % smaller;
        }

        System.out.println(smaller);

    }
}
