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
        var s = Math.min(a, b);
        for(;s <= x; x--) {
            var tmp = (a*x / b) - a*(x / b);
            if(r<tmp) {
                r = (long)tmp;
            }
        }
        System.out.println(r);
    }

}
