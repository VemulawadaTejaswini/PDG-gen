import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a+b<c){
      long d =c-a-b;
      long e =d*d-4*a*b;
      long f=(c-a-b)*(c-a-b)-4*a*b;
      if(e>0){System.out.println("Yes");}
      else if(f>0){System.out.println("Yes");}
      else{System.out.println("No");}
    }
    else{System.out.println("No");}
  }
}
