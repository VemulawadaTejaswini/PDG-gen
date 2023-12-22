import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		long i = Long.parseLong(in.next());
		
		System.out.println(i*i*i);
	}
}