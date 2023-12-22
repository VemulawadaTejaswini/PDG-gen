public class Main {

	public static void main (String[] args) {
		
		
		while (true)
		{
			String[] input = new java.util.Scanner ( System.in ).nextLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			if (x == 0 && y == 0)
				break;
			if (x <= y)
				System.out.println(x + " " + y);
			else if ( x > y)
				System.out.println(y + " " + x);
		
		}
	}
}