import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   int D = sc.nextInt();
   int  s=A*B;
   int r=C*D;
   if(s>r) {
	   System.out.println(s);
   }
   else {
	   System.out.println(r);
   }
  }
}
		