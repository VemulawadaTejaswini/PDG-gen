public class Practice{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("X:");
		int x = stdIn.nextInt();
		System.out.print("A:");
		int a = stdIn.nextInt();
		if(x <a)
			System.out.print(0);
		else
			System.out.print(10);
	}
}
