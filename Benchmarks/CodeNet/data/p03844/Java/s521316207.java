public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		String op;
		int output = 0;
		
		String input = sc.nextLine();
		A = Integer.parseInt(input.substring(0, 1));
		op = input.substring(1, 2);
		B = Integer.parseInt(input.substring(2, 3));
	
		if(op.equals("+"))
		{
			output = A + B;
		}
		else if(op.equals("-"))
		{
			output = A - B;
		}
		
		System.out.println(output);
	}
