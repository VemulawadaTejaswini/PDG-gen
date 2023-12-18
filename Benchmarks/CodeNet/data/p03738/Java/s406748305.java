import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    if(a<b) {
      System.out.println("LESS");
    } else if(a>b) {
      System.out.println("GREATER");
    } else {
      System.out.println("EQUAL");
    }
    
  }
}
