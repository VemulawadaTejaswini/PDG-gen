import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.close();

    int n = N % 10;
    if(n==2 || n==4 || n==5 || n==7 || n==9) {
      System.out.println("hon");
    }
    else if(n==0 || n== 1 || n==6 || n==8) {
      System.out.println("pon");
    }
    else if(n==3) {
      System.out.println("bon");
    }
  }
}