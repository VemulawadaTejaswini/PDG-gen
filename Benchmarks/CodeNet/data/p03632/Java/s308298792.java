import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt()+a;
    int c=sc.nextInt();
    int d=sc.nextInt()+c;
    System.out.println(Math.max(Math.min(b,d)-Math.max(a,c),0));
  }
}