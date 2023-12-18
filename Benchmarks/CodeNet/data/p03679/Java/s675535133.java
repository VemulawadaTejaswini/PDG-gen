import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int X = sc.nextInt();
	   int A = sc.nextInt();
	   int B = sc.nextInt();
	   
	   int s = B - A + 1;
	   
	   if(s == X) {
		   System.out.println("safe");
	   }else if(s <= X) {
		   System.out.println("delicious");
	   }else if(s >= X) {
		   System.out.println("dangerous");
	   }
		}
}
