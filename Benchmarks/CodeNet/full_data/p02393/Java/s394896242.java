
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d;
 if(a > b){
     d= a;
     a = b;
     b = d;
 }
  if(b > c){
      d=b;
      b=c;
      c=d;
  }
 if(a > b){
     d=a;
     a=b;
     b=d;
 }
    System.out.println(a+" "+b+" "+c);         
    }
}

