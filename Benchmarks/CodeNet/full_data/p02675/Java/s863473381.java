import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int num = N % 10;
    if (num == 3){
      System.out.println("bon");
    }else if (num == 0 || num = 1 || NUM = 6 || NUM = 8){
      System.out.println("pon");
    } else {
      System.out.println("hon");
    }
  }
}
