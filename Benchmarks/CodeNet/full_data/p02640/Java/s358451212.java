import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    String S = "";
    if(2*X <= Y && Y <= 4*X && Y%2==0){
      S = "Yes";
    } else {
      S = "No";
    }
    System.out.println(S);
  }
}