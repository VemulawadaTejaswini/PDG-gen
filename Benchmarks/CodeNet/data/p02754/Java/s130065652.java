import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt(); 
    int A =sc.nextInt();
    int B =sc.nextInt();
    int m =N/(A+B);
    int n=N-m*(A+B);
    if(n<A){System.out.println(m*A+n);}
    else{System.out.println((m+1)*A);}
  }
}