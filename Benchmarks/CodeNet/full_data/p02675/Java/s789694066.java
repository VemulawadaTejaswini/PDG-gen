import java.util.Scanner;

public class main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int num = N % 10;
    if (num == 3){
      System.out.println("bon");
    }else if (num == 0 || 1 || 6 || 8){
      System.out.println("pon");
    } else {
      System.out.println("hon");
    }
  }
}