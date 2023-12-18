public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int a = sc.nextInt();
		final int b = sc.nextInt();
		sc.close();
		String abStr = ""+a+b;
		int ab = Integer.parseInt(abStr);

		if(Math.pow((int)Math.sqrt(ab), 2) == ab) System.out.println("Yes");
		else 								 	  System.out.println("No");
	}

}
