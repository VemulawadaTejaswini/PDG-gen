import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    while(true){
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=0;
      if(a==0 && b==0) break;
      if(a>b){
        c=a;
        a=b;
        b=c;
      }
      System.out.println(a+" "+b);
    }
  }
}

