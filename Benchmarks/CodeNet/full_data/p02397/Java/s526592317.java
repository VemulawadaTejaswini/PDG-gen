import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a,b,tmp;

		Scanner scan = new Scanner(System.in);

		while(true)
		{
		    a = scan.nextInt();
		    b = scan.nextInt();

		    tmp = a | b;

		    if(tmp == 0) break;

		    else if(b<a)
		    {
		    	tmp = a;
		    	a = b;
		    	b = tmp;
		    }

		    System.out.println(a + " " + b);
		}

	    scan.close();

	}
}