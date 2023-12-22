import java.util.Scanner;
import java.math.BigDecimal;
import java.lang.Double;
public class Main{

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  //double a = sc.nextDouble();
  //double b = sc.nextDouble();
  //double c = sc.nextDouble();

//BigDecimal b1 = new BigDecimal(sc.nextDouble());
//BigDecimal b2 = new BigDecimal(sc.nextDouble());
//BigDecimal b3 = new BigDecimal(sc.nextDouble());

//double a = b1.divide(b2);


int a = sc.nextInt();
int b = sc.nextInt();
String stra = Integer.toString(a);
String strb = Integer.toString(b);
BigDecimal da = new BigDecimal(stra);
BigDecimal db = new BigDecimal(strb);
//System.out.println("da/db "+da.divide(db)+";");
//double db = Double.parseDouble(strb);
BigDecimal dr = da.divide(db,6,BigDecimal.ROUND_HALF_UP);
//System.out.println(dr);
System.out.println(a/b+" "+a%b+" "+dr);
}


}
