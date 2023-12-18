import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextLong();
    long z = 100;
    int sum = 0;
    while (z<x){
      long g = (long) z/100;
      z+=g;
      sum += 1;
    }
    System.out.println(sum);
  }
}
