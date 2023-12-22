import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            double x4 = scanner.nextDouble();
            double y4 = scanner.nextDouble();

            
            if (isParallel(x1, y1, x2, y2, x3, y3, x4, y4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean isParallel(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if ( (y2-y1)/(x2-x1) == (y4-y3)/(x4-x3) ) {
            return true;
        } else {
            return false;
        }
    }
}