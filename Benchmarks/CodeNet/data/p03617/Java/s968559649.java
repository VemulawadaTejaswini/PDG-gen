
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long Q = sc.nextInt();
    long H = sc.nextInt();
    long S = sc.nextInt();
    long D = sc.nextInt();
    long N = sc.nextInt();
    long u[] = new long[3];
    u[0]=Q*4;
    u[1]=H*2;
    u[2]=S;
    Arrays.sort(u);
    long U = u[0];
    if(U*2<=D){
      System.out.println(N*U);
      return;
    }
    if(U>D&&N%2==0){
      System.out.println((N/2)*D);
      return;
    }
    System.out.println((N/2)*D+U);

  }
  

  
}
