import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();

    int hh = sc.nextInt();
    int ww = sc.nextInt();

    int a  = h*w - hh*w - ww*h + hh*ww;

    System.out.println(a);
  }
}
