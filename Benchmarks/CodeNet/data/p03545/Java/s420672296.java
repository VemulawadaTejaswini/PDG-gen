
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  try (Scanner sc = new Scanner(System.in)) {
      String s=sc.next();
      int a=s.charAt(0)-'0', b=s.charAt(1)-'0', c=s.charAt(2)-'0', d=s.charAt(3)-'0';
        if(a-b-c-d ==7) System.out.printf ("%d-%d-%d-%d=7\n",a,b,c,d);
        else if(a-b-c+d ==7) System.out.printf ("%d-%d-%d+%d=7\n ",a,b,c,d);
        else if(a-b+c-d ==7) System.out.printf ("%d-%d+%d-%d=7\n",a,b,c,d);
        else if(a-b+c+d ==7) System.out.printf ("%d-%d+%d+%d=7\n",a,b,c,d);
        else if(a+b-c-d ==7) System.out.printf ("%d+%d-%d-%d=7\n",a,b,c,d);
        else if(a+b-c+d ==7) System.out.printf ("%d+%d-%d+%d=7\n",a,b,c,d);
        else if(a+b+c-d ==7) System.out.printf ("%d+%d+%d-%d=7\n",a,b,c,d);
        else if(a+b+c+d ==7) System.out.printf ("%d+%d+%d+%d=7\n",a,b,c,d);
  }
 }
}