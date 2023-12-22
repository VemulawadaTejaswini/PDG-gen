import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long A =sc.nextLong();
    double B =sc.nextDouble();
    double C =B*100;
    long D =(long) C;
    long E =A*D;
    long F =E/100;
    System.out.println(F);
  }
}
