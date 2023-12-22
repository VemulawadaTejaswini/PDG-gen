import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in){
    int ans = 15;
    for (int i = 0; i < 5; i++){
      x = scan.nextInt();
      ans = ans - x;
    }
    System.out.println(ans);
  }
}