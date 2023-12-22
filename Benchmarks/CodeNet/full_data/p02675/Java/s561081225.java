import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int j = n%10;
    if (j == 2 or j == 4 or j == 5 or j == 7 or j == 9){
      System.out.println("hon");
    }else if (j == 0 or j == 1 or j == 6 or j == 8){
      System.out.println("pon");
    }else{
      System.out.println("bon");
    }
  }
}