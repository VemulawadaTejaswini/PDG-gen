import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(Math.max(a+a-1,Math.max(b+b-1,a+b)));
  }
}
