import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int k = in.nextInt();

    for(int i = a;i<a+k&&i<=b-k;i++){
      System.out.println(i);
    }
    for(int i = b-k+1;i<=b&&i>=a;i++){
      System.out.println(i);
    }
  }
}
