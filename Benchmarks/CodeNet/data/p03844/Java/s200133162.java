import java.io.*;
import java.util.*;

public class main
{

	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 int first = scan.nextInt();
		 String op = scan.next();
		 int second = scan.nextInt();
		 if(op.equals("+")) {
			 System.out.println(first + second);
		 } else {
			 System.out.println(first - second);
		 }
	}

}