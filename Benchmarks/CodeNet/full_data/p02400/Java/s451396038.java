import java.io.*;
import java.util.*;

class Main { 
public static void main (String[] args){
  Scanner scan = new Scanner(System.in);

  double r = scan.nextDouble();
  double x = Math.PI;

  System.out.printf("%.5f %.5f\n",r * r * x);
  System.out.printf("%.5f %.5f\n",r * 2 * x);

}
}