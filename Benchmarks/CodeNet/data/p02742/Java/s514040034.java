import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();//横
    int y = scan.nextInt();//縦

    double z = (double)x*y/2;
    int answer = (int)Math.round(z);
    System.out.println(answer);
  }
}