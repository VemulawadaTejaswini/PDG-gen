import java.util.*;
import java.io.*;

class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double m = sc.nextDouble();
    
    System.out.println(String.format("%.0f", Math.floor(n*m)));
  }
}