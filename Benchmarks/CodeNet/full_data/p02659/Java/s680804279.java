import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  final static int max = 100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      double A,B;
      int i = 0;
      String N;     

       while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      N = list.get(0);
      String atai[] = N.split(" ",0);
      double  a[] = new double[atai.length] ;
       while(i < atai.length){
        a[i] = Double.parseDouble(atai[i]);
     //   System.out.println(a[i]);
        i++;
       }
      A = a[0];
      B = a[1];
        cal(A,B);
        scan.close();
    }
  
  public static void cal(double a,double b){
     double s = 0;
     double result;
     s = a*b;
     result = Math.floor(s);
    System.out.println(String.format("%.0f", result));
  }
}