import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long A =sc.nextLong();
    String B =sc.next();
    String b[] =B.split("",0);long D;
    D =Integer.parseInt(b[0]+b[2]+b[3]);
    long E =A*D;
    long F =E/100;
    System.out.println(F);
  }
}