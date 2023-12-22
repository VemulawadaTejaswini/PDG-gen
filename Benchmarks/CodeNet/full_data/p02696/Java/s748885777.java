import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var a_b_n = scaner.nextLine().split(" ");
        var a = Integer.parseInt(a_b_n[0]);
        var b = Integer.parseInt(a_b_n[1]);
        var n = Integer.parseInt(a_b_n[2]);
        scaner.close();

        var x = n;
        int r = 0;
        for(;0 < x; x--) {
            var tmp = floor((a*x / b)) - a*floor(x / b);
            if(r<tmp) {
                r = tmp;
            }
        }
        System.out.println(r);
    }

    public static int floor(double t) {
        return (int)Math.floor(t);
    }
}
