import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a, b, c, sqr;
		String n;
		
		while(scan.hasNextInt())
		{
			n = "";
			a = scan.nextInt();
			b = scan.nextInt();
			
			n =  n + a + b;
			c = Integer.parseInt(n);
			sqr = (int)Math.sqrt(c);
			
			if(sqr * sqr == c)
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}

	}

}