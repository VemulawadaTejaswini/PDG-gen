import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int L=sc.nextInt();
    int R=sc.nextInt();
    int d=sc.nextInt();
    int ans=(int)Math.floor(R*1.0/d)-(int)Math.ceil(L*1.0/d)+1;
    System.out.println(ans);
  }
}