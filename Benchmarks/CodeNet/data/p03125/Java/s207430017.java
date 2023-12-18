public static void main(String[] args)
	{
		int a,b;

		Scanner scanner = new Scanner(System.in);

		a = Integer.parseInt(scanner.next());

		b = Integer.parseInt(scanner.next());


		if( b%a ==0)
			System.out.println(a+b);

		else
			System.out.println(b-a);

	}