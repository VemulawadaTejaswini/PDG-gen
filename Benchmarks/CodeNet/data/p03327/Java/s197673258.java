import java.util.Scanner;

public class Main{
  public static void main(String argv[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if (n > 999){
      System.out.println("ABD");
    }else{
      System.out.println("ABC");
    }

  }
}
