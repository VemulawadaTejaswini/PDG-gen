import java.util.*;
 
class Main {
    public static void main(String args[]) {
        double a, b, c, d, ac = 0, bd = 0, f = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        ac = c - a;
        bd = d - b;
        ac *= ac;
        bd *= bd;
        f = ac + bd;
        double ans = Math.sqrt(f);
        System.out.println(ans);
        sc.close();
    }
}

