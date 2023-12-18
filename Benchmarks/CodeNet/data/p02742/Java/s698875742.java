import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextInt();//横
    long y = scan.nextInt();//縦

    double z = (double)x*y/2;
    long answer = (long)Math.round(z);
    System.out.println(answer);
  }
}