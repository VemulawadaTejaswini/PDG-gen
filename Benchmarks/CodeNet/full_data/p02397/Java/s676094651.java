public class Main {

public static void main(String[] args){
	
	for (int f = 0; f < 1;)
	{
		String[] input = new java.util.Scanner(System.in).nextLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		if (a == 0 && b == 0)
			break;
		if (a <= b)
		{
			System.out.println(a + " " + b);
		}
		else if (a > b)
		{
			System.out.println(b + " " + a);
		}
	}
}
}