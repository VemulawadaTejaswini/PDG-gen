public class Main {

	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		
		for(int j = 1; j < n + 1; j++) {
			if(j % 3 == 0||j % 10 == 3||j % 100 == 3||j % 1000 == 3||j / 10 == 3||j / 100 == 3||j / 1000 == 3) {
				System.out.print(" " + j);
			}
		}
		
		System.out.println();
	}

}