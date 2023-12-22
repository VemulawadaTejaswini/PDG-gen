public class Main {
public static void main(String[] args){
	
	long i = 1;
	while (true)
	{
		long x = new java.util.Scanner (System.in).nextInt();
		if (x == 0)
			break;
		else
			System.out.println("Case " + i + ": " + x);
		i++;
	}
}
}