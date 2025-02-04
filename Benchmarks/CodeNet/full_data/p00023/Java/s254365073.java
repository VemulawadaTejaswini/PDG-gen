import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            double[] x = new double[2];
            double[] y = new double[2];
            double[] r = new double[2];
            for (int j = 0; j < 2; j++) {
                x[j] = scanner.nextDouble();
                y[j] = scanner.nextDouble();
                r[j] = scanner.nextDouble();
            }
            
            double xy = Math.sqrt( Math.pow(x[1]-x[0], 2)+Math.pow(y[1]-y[0], 2) );
            double rsum = r[0] + r[1];
           
            if (xy > rsum) {
                System.out.println("0");
            } else if (Math.abs(r[0]-r[1]) <= xy && xy <= rsum) {
                System.out.println("1");
            } else if (r[0] > r[1]) {
                System.out.println("2");
            } else {
                System.out.println("-2");
            }
        }
    }
}