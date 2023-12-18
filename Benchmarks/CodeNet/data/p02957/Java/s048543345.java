import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt();
        String res = "IMPOSSIBLE";
        if(a != b) {
            Double k = (Math.pow(a, 2) - Math.pow(b, 2)) / (2 * (a - b));
            if(k == k.intValue()) res = String.valueOf(k.longValue());
        } else {
            res = "0";
        }
        System.out.println(res);
    }
}