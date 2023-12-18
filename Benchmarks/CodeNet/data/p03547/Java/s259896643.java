import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next().toCharArray()[0];
    String y = sc.next().toCharArray()[0];
    if(x<y){
      System.out.println("<");
    }else if(x==y){
      System.out.println("=");
    }else{
      System.out.println(">");
    }
  }
}