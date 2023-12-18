import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt();
    int C =sc.nextInt();
    int D =sc.nextInt();
    while(A*C>0){
      C=C-B;
      if(C<=0){System.out.println("Yes");System.exit(0);}
      A =A-D;
      if(A<=0){System.out.println("No");System.exit(0);}
    }
  }
}