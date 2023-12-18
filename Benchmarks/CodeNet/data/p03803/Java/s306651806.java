import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a==b) {
      System.out.print("Draw");
    }else if(a==1){
      System.out.print("Alice");
    }else if(b==1){
      System.out.print("Bob");
    }else if(a>b){
      System.out.print("Alice");
    }else{
      System.out.print("Bob");
    }
  }
}