import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ans = (sc.nextInt() == sc.nextInt())?"Yes":"No";
    System.out.println(ans);
  }
}