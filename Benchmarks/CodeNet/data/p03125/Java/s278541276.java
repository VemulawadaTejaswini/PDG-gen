import java.util.Scanner;
public class Main{
  public static void main(String... args){
    try(Scanner scan = new Scanner(System.in)) {
      	String message = scan.next();
      	int a = Integer.valueOf(message.split(" ")[0]);
      	int b = Integer.valueOf(message.split(" ")[1]);
    }catch(InputMismatchException e) {
        System.out.println("0～9までの数値を入力してください");
        break;
     }
  }
  public static boolean isYakusuu(int a,int b){
    return b%a == 0;
  }
}