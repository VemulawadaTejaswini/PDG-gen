import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        double r = Double.parseDouble(str);


        double s = (double)r * (double)r * (double)(Math.PI);
        double l = (double)2 * (double)r * (double)(Math.PI);

        System.out.printf("%.6f %.6f", s, l);

        scn.close();


    }
}
