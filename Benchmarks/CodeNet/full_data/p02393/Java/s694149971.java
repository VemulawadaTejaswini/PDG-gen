import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
			int a;
			int b = 0;
			int c = 0;
			Scanner scan = new Scanner(System.in);
		    a = scan.nextInt();
		    b = scan.nextInt();
		    c = scan.nextInt();
		    if(a<b)
		    if(b<c)
		    	System.out.println(a + " " + b + " " + c);
		     if (a > b)
			 if (b > c)
				 System.out.println(c + " " + b + " " + a);


			 if (a > b)
			 if (b < c)
			 if (a > c)
				 System.out.println(b + " " + c + " " + a);


			 if (a > b)
			 if (b < c)
			 if (a < c)
				 System.out.println(b + " " + a + " " + c);


			 if (a < b)
			 if (b < c)
				 System.out.println(a + " " + b + " " + c);


			 if (a < b)
			 if (b > c)
			 if (a > c)
				 System.out.println(c + " " + a + " " + b);


			 if (a < b)
			 if (b > c)
			 if (a < c)
				 System.out.println(a + " " + c + " " + b);
		}

}