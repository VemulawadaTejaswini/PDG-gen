import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int ab=sc.nextInt();
    int bc=sc.nextInt();
    int ca=sc.nextInt();
    // ac*ac-(bc+x)*(bc+x)=h*h
    // ab*ab-x*x=h*h
    // ac*ac-ab*ab-bc*bc-2*bc*x=0
    // 2bc*x=ac*ac-ab*ab-bc*bc
    int x=(ca*ca-ab*ab-bc*bc)/(2*bc);
    double high=Math.sqrt(ab*ab-x*x);

    double ans=bc*high/2;

    System.out.println(ans);
  }
}
