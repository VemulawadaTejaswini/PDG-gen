import java.io.*;
import java.util.*;

class Main { 
public static void main (String[] args){
  Scanner scan = new Scanner(System.in);

  int r = scan.nextInt();
  double x = Math.PI;

  System.out.println(r * r * x);
  System.out.println(r * 2 * x);
}
}