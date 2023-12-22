import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var a_b_n = scaner.nextLine().split(" ");
        var a = Long.parseLong(a_b_n[0]);
        var b = Long.parseLong(a_b_n[1]);
        var n = Long.parseLong(a_b_n[2]);
        scaner.close();

        long x = n;

        if(n >= b-1) x = b-1;
        long ans = a*(x/b)/b;
        System.out.println(ans);
    }

}
