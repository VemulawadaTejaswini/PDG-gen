import java.util.Scanner;
public class aoj10008 {
   public static void main(String[]  args){
	   Scanner buf = new Scanner(System.in);
	   long a,b;
	   a = buf.nextInt();
	   b = buf.nextInt();
	   System.out.print(a/b + " " + a%b + " ");
	   System.out.printf("%.5f\n",(double)a/b);
   }
}