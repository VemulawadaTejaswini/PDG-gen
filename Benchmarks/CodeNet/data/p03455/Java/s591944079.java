import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = a + b;
    int num = Integer.parseInt(c);
    double k = Math.sqrt(num);
    if(k * k == num){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }