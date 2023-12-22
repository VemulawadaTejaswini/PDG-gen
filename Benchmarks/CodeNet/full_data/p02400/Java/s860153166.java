import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        double r = Double.parseDouble(str);
        scan.close();

        double s = r*r*Math.PI, l = 2*r*Math.PI;

        System.out.println(String.format("%.6f %.6f", s, l));
    }
}
