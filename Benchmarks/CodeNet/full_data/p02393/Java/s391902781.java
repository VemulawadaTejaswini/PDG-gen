import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		      int max = 0;
		      int middle = 0;
		      int min = 0;

		      int a = sc.nextInt();
		      int b = sc.nextInt();
		      int c = sc.nextInt();
		         
		      if(a <= b && b <= c) {
		        min = a;
		        middle = b;
		        max = c;
		      }else if(a <= c && c <= b) {
		        min = a;
		        middle = c;
		        max = b;
		      }else if(b <= a && a <= c) {
		        min = b;
		        middle = a;
		        max = c;
		      }else if(b <= c && c <= a) {
		        min = b;
		        middle = c;
		        max = a;
		      }else if(c <= a && a <= b) {
		        min = c;
		        middle = a;
		        max = b;
		      }else if(c <= b && b <= a) {
		        min = c;
		        middle = b;
		        max = a;
		      }

		        System.out.println(min + " " + middle + " " + max);
			 
    }
}
