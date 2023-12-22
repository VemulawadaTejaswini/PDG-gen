import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int d = a / b;

        int r = a % b;

        double f = a / (double)b;

        //System.out.println(d + " " + r + " " + f);

        System.out.printf("%d %d %.10f\n", d, r, f);


    }
}
