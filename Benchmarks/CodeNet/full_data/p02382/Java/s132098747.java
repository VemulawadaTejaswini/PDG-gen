import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_10_D
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String inputStr = null;
            int n = 0;
            double x[] = null;
            double y[] = null;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // n???????????????.
                if (lineNumReader.getLineNumber() == 1) {
                    n = Integer.parseInt(inputStr);
                }
                
                // ????????¢
                if (lineNumReader.getLineNumber() == 2) {
                    String[] points = inputStr.split(" ");
                    x = new double[n];
                    int i = 0;
                    for (String point : points) {
                        x[i] = Double.parseDouble(point);
                        i++;
                    }
                }
                
                if (lineNumReader.getLineNumber() == 3) {
                    String[] points = inputStr.split(" ");
                    y = new double[n];
                    int i = 0;
                    for (String point : points) {
                        y[i] = Double.parseDouble(point);
                        i++;
                    }
                    break;
                }
            }
            
            // ????????????.
            System.out.println(String.format("%.8f",
                    getManhattanDistance(x, y)));
            System.out.println(String.format("%.8f",
                    getEuclidDistance(x, y)));
            System.out.println(String.format("%.8f", getP3Distance(x, y)));
            System.out.println(String.format("%.8f",
                    getChebyshevDistance(x, y)));
            
            lineNumReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    
    public static double getManhattanDistance(double x[], double y[]) {
        double ret = 0.0;
        for (int i = 0; i < x.length; i++) {
            ret += Math.abs(x[i] - y[i]);
        }
        return ret;
    }
    
    public static double getEuclidDistance(double x[], double y[]) {
        double ret = 0.0;
        for (int i = 0; i < x.length; i++) {
            ret += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return Math.pow(ret, 0.5);
    }
    
    public static double getP3Distance(double x[], double y[]) {
        double ret = 0.0;
        for (int i = 0; i < x.length; i++) {
            double temp = Math.abs(x[i] - y[i]);
            ret += Math.pow(temp, 3.0);
        }
        return Math.pow(ret, 1.0 / 3.0);
    }
    
    public static double getChebyshevDistance(double x[], double y[]) {
        double max = 0.0;
        for (int i = 0; i < x.length; i++) {
            double temp = Math.abs(x[i] - y[i]);
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}