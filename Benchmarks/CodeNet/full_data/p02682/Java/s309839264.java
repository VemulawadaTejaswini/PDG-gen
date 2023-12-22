import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long A =sc.nextLong();
    long B =sc.nextLong();
    long C =sc.nextLong();
    long K =sc.nextLong();
    if(K<A){System.out.println(K);}
    else if(K<A+B){System.out.println(A);}
    else{long D =A*2+B-K;
         System.out.println(D);}
  }
}