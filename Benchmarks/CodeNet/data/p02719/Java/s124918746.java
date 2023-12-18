import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong(); 
    long y = scanner.nextLong();
    if(x<y){
      System.out.print(x);
    }
    else{
      long a = x%y;
      //System.out.print(a);
      if(a == 0){
        System.out.print(a);
      }
      else{
        long b = Math.abs(y-a);
      	System.out.print(b);
      }
    }
  }
}