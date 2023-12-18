import java.util.*;
public class ABC086a {
  public static void main(String[] args){
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.print("a=");
    a=sc.nextInt();
    System.out.println();
    System.out.print("b=");
    b=sc.nextInt();
    if((a*b)%2==0) System.out.println("Even");
    else System.out.println("Odd");
  }
}