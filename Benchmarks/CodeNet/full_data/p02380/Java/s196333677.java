import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_10_B
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
            double a = 0;
            double b = 0;
            double C = 0;
            
            double S = 0;
            double L = 0;
            double h = 0;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ??????????????????????????????.
                if (lineNumReader.getLineNumber() == 1) {
                    String[] points = inputStr.split(" ");
                    a = Double.parseDouble(points[0]);
                    b = Double.parseDouble(points[1]);
                    C = Double.parseDouble(points[2]);

                    
                    // ??¢???????¨????.
                    double rad = 2.0*Math.PI*(C/360);
                    S = 0.5 * b * a * Math.sin(rad);
                    
                    // ?????¨.
                    // ?????????????????????????????????????±???????.
                    double remainLine = Math.sqrt(a*a + b*b -2*a*b*Math.cos(rad)); 
                    L = remainLine + a + b;
                    
                    // a???????????¨????????¨????????????h
                    h = 2*S/a;

                    // ????????????.
                    System.out.println(String.format("%.8f", S));
                    System.out.println(String.format("%.8f", L));
                    System.out.println(String.format("%.8f", h));
                }
                
                if (lineNumReader.getLineNumber() > 1) {
                    break;
                }
            }
            
            lineNumReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
        
    }
    
    public static String shuffle(String original, int h) {
        StringBuilder shuffledStr = new StringBuilder(original);
        String temp = shuffledStr.substring(0, h);
        shuffledStr.delete(0, h);
        shuffledStr.append(temp);
        return shuffledStr.toString();
        
    }
}