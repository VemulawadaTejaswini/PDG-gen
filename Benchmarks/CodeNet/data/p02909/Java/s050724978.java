import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String a ="Sunny";
    String b ="Cloudy";
    String c ="Rainy";
    if(s.equals(a)){
      System.out.println(b);
    }else if(s.equals(b)){
      System.out.println(c);
    }else if(s.equals(c)){
      System.out.println(a);
    }
  }
}
