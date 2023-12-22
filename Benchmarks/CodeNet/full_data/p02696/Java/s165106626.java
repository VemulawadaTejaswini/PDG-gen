import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var a_b_n = scaner.nextLine().split(" ");
        var a = Long.parseLong(a_b_n[0]);
        var b = Long.parseLong(a_b_n[1]);
        var n = Long.parseLong(a_b_n[2]);
        scaner.close();

        var x = n;
        long r = 0;
        for(;0 < x; x--) {
            var tmp = floor((a*x / b)) - a*floor(x / b);
            if(r<tmp) {
                r = tmp;
            }
        }
        System.out.println(r);
    }

    public static long floor(double t) {
        return (long)Math.floor(t);
    }
}
