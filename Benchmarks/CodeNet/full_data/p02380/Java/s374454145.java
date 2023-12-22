import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
        DecimalFormat df = new DecimalFormat("0.00000000");
        
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double degree = Double.parseDouble(sc.next());
        double radian = Math.toRadians(degree);
        double c = Math.sqrt(a*a + b*b - 2.0*a*b*Math.cos(radian));
        double height = b*Math.sin(radian);
        double area = a*b*Math.sin(radian)*0.5;
        out.println(area);
        out.println(a+b+c);
        out.println(height);
        
        out.flush();
    }
}
