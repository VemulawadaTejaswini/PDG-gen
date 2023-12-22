import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        
        double a = (r*r)*Math.PI;
        double b = 2*r*Math.PI;
        
        System.out.println(String.format("%.6f",a) + " " + String.format("%.6f",b));
        
    }
}

