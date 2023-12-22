import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 
public class Main{
 
    private static double a, b, c, d, e, f;
    private static double x, y;
 
    public static void main(String args[]) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] array;
 
        while((line = br.readLine())  != null) {
            array = line.split(" ");
             
            // set input data
            setParams(array);
 
            // calc y
            if(d == 0 ){
                y = f/e;
            }
            else {
                y = c - f * a / d;
                y = y / (b - e * a / d);
            }
             
            // calc x
            if (a == 0) {
                x = (f - e * y) / d;
            } else {
                x = (c - b * y) / a;
            }
            System.out.println(new BigDecimal(x).setScale(3, BigDecimal.ROUND_HALF_UP) + " " + new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP));
        }
    }
 
    private static void setParams(String[] array) {
        a = Double.parseDouble(array[0]);
        b = Double.parseDouble(array[1]);
        c = Double.parseDouble(array[2]);
        d = Double.parseDouble(array[3]);
        e = Double.parseDouble(array[4]);
        f = Double.parseDouble(array[5]);
    }
}