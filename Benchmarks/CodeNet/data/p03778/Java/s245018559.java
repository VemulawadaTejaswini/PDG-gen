import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int w=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(Math.min(Math.min(Math.abs(a-b),Math.abs(a-w)),Math.abs(b-w)));
    
  }
}