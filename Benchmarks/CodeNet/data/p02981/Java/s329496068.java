import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(n*a>=b){
      System.out.println(b);
    }else{
      System.out.println(n*a);
    }
  }
}