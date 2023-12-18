import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long l = sc.nextLong();
		
		long n = 100;
		long day = 0;
		
		while(n<l)
		{
			day++;
			long gain = (n/100l);
			n += gain;
		}
		
		System.out.println(day);
	}

}
