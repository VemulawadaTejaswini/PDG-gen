
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        double f = r*r*Math.PI;
        double d = 2*r*Math.PI;

        String str = String.format("%.6f",f);
        String str2 = String.format("%.6f", d);
        System.out.println(str+" "+str2);
    }
}

