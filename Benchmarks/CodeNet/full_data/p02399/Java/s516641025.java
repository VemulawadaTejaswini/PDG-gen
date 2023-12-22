import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int i=0,count=0;
    int a=stdIn.nextInt();
    int b=stdIn.nextInt();
    System.out.printf("%d %d %.5f\n",a/b,a%b,(double)a/b);
  }
}

