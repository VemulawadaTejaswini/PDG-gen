import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Integer n = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    System.out.println(Math.min(a,b)+" "+Math.max(0,a+b-n));
  }
  }
