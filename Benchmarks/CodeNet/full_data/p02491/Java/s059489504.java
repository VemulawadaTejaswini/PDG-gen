import java.util.Scanner;
public class Main {
   public static void main(String[]  args){
	   Scanner buf = new Scanner(System.in);
	   int a,b;
	   a = buf.nextInt();
	   b = buf.nextInt();
	   System.out.print(a/b + " " + a%b + " ");
	   System.out.println((double)a/b);
   }
}