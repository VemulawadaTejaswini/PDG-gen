import java.util.Scanner;
public class Main {

  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    
    int A1 = a.nextInt();
    int A2 = a.nextInt();
    int A3 = a.nextInt();

    if (A1+A2+A3>=22){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
}
