import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int a = 4;
    int b = 7;
    if(n1%a==0 || n1%b==0 || n1%(a+b)==0){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}