import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int H = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    double radH = -Math.toRadians(H * 30) + 90;
    double radM = -Math.toRadians(M * 6) + 90;
    double hX = A * Math.cos(radH);
    double hY = A * Math.sin(radH);
    double mX = B * Math.cos(radM);
    double mY = B * Math.sin(radM);
    double distance = Math.sqrt((hX - mX) * (hX - mX) + (hY - mY) * (hY - mY));
    System.out.println(distance);
  }
}