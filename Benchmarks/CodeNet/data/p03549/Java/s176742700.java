import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        double n=sc.nextDouble();
        double m=sc.nextDouble();
        double x=0;
        for (int i = 1; i < 100000; i++) {
            x+=((n-m)*100+1900*m)*pow(0.5,m*i)*(double) i;
        }
        out.println(round(x));
    }
}