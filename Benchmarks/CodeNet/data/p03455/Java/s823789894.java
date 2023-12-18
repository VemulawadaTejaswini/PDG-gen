import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a % 2 == 1){
      System.out.println("Odd");
    }else{
      System.out.println("Even");
    }
    int b = sc.nextInt();
    if(b % 2 == 1){
      System.out.println("Odd");
    }else{
      System.out.println("Even");
    }
  }
}