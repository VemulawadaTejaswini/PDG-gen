import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int result = 0;

        int min = Math.min(p,q);
        int max = Math.max(p,q);

        result += min;

        int secondmin = Math.min(max,r);

        result += secondmin;


        System.out.println(result);
    }
}