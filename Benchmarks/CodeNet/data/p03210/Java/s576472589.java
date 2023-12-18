import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    String ans;
    if(X == 7 || X == 5 || X == 3){
      ans = "YES";
    }else{
      ans = "NO";
    }
    System.out.print(ans);
  }
}