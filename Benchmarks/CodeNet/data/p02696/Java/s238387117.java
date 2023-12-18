import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long A=sc.nextLong();
    long B=sc.nextLong();
    long N=sc.nextLong();
    long D;
    if(B==1){System.out.println(0);}
    else{
    long C =Math.min(B,N);
      D=A*C/B;
      if(C==B){System.out.println(D-1);}
      else{
    System.out.println(D);}
  }}
}