import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        sc.close();
        DecimalFormat df1 = new DecimalFormat("0.00000");
        System.out.println(df1.format(r*r*Math.PI) + " " + df1.format(2*r*Math.PI));
    }
}