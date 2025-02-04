import java.math.BigDecimal;
import java.util.Scanner;

class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int   r = sc.nextInt();
        sc.close();
        
        double pi   = Math.PI;
        double ci = 2*pi*r;
        double ar = pi*Math.pow(r,2);

        String circ = BigDecimal.valueOf(ci).toPlainString();
        String area = BigDecimal.valueOf(ar).toPlainString();
        
        System.out.println(new StringBuilder()
            .append(circ).append(" ")
            .append(area));
    }
}