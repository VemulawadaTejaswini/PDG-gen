
import java.io.*;
import java.math.BigDecimal;

public class Main{
    private static final BigDecimal pi = 3.1415926535;

    public static void main(String[] args) throws IOException{
        String str = getLine();
        BigDecimal r = Double.parseDouble(str);
        double s = r.multiply(r).multiply(pi).doubleValue();
        double l = r.multiply(2).multiply(pi).doubleValue();
        System.out.printf("%.6f %.6f\n",s,l);
    }

    public static String getLine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        return str;
    }
}
