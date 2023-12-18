import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int K=sc.nextInt();
    int A=sc.nextInt();
    int B=sc.nextInt();
    if(A%K==0){System.out.println("OK");}
    else if(B%K==0){System.out.println("OK");}
    else{
      int a=A/K;
      int b =B/K;
      if(a==b){System.out.println("NG");}
      else{System.out.println("OK");}
    }
  }
}