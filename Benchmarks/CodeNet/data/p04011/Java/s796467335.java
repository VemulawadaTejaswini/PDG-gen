
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        System.out.println(calcCost(n,k,x,y));
        sc.close();
    }

    public static  int calcCost(
          final int n
        , final int k
        , final int x
        , final int y) {

        if(n <= k) {
            return x * n;
        } else {
            return x * k + y * (n - k);
        }
    }
}