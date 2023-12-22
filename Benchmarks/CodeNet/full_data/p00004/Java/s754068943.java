import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            double e = scanner.nextDouble();
            double f = scanner.nextDouble();
            
            if (b*d != a*e) {
                double y = (c*d - a*f) / (b*d - a*e);
                double x = (c*e - b*f) / (a*e - b*d);
                System.out.println(x + " " + y);
            }
        }
    }
}