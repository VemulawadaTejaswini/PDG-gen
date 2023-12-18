import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;

        int[] money = new int[206];
        Arrays.fill(money, 0);
        money[1] = 300000;
        money[2] = 200000;
        money[3] = 100000;

        if (x == 1 && y == 1) {
            ans = 1000000;
        }  else {
            ans += money[x];
            ans += money[y];
        }
        System.out.println(ans);
    }
}