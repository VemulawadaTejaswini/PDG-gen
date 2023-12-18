import java.util.Scanner;
public class Main {

  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    int A1 = a.nextInt();
    Scanner b = new Scanner(System.in);
    int A2 = b.nextInt();
    Scanner c = new Scanner(System.in);
    int A3 = c.nextInt();
    
    if (A1+A2+A3 >= 22){
      System.out.println("bust");
    }else if (A1+A2+A3 <=21){
      System.out.println("win");
    }
  }
}
