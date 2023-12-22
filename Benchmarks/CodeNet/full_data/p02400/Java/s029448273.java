import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = 3.14159265358979323846 * r * r;
        double l = 3.14159265358979323846 * r * 2;

        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(5);
        format.setMinimumFractionDigits(5);
        format.setGroupingUsed(false);
        System.out.println("" + format.format(a) + " " + format.format(l));
    }
}