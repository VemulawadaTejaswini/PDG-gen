import java.io.*;
import java.util.*;

class test {
  public static void main (String [] args) throws IOException {
       Scanner sc= new Scanner (System.in());
     int W= sc.nextInt();
     int H= sc.nextInt();
     int x= sc.nextInt();
     int y= sc.nextInt();
    double half =(W*H)/2;
    System.out.print(half);
    if(2*x==W && 2*y==H)System.out.print(" "+ 1);
    else System.out.print(" " +0);

  }
  
}