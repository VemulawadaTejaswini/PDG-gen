import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = a+b==15 ? "+":a*b==15 ? "*":"x";
    System.out.println(s);
  } 
}