import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a+b<c){
    long d =c-a-b;
      long e =d*d;
      long f =4*a*b;
      long g =e-f;
    if(g>0){System.out.println("Yes");}
    else{System.out.println("No");}}
    else{System.out.println("No");}
  }
}
