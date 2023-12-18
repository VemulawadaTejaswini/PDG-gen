import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    String s;
    if(a+b==15){
      s = "+";
    }else if(a*b==15){
      s = "*";
    }else{
      s = "x";
    }
    System.out.println(s);
  }
}
