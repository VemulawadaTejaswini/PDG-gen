import java.util.*;
public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
    int N=Integer.parseInt(sc.next());
    int X=Integer.parseInt(sc.next());
    int T=Integer.parseInt(sc.next());
    System.out.println((N+X-1))/X);
  }
}