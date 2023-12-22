import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int i = 1;
    while(true){
      Scanner sc = new Scanner(System.in);
      int in = sc.nextInt();
      if (in == 0)
        break;
      else
        System.out.println("Case " + i++ + ": " + in);
      }
  }
}