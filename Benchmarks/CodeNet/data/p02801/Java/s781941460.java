    import java.util.*;
	import java.lang.Math;
    public class Main 
	{
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			char a = scan.next().charAt(0);
			String next = String.valueOf( (char) (a + 1));
			System.out.println(next);
		}
    }