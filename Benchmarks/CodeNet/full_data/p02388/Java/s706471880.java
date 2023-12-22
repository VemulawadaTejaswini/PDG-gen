public class Main {
	public static void main(String[] args) {

		int a;
		
		try(Scanner scanner=new Scanner(System.in)){
			a=scanner.nextInt();
		}
		
		a=a*a*a;
		
		System.out.println(a);
	}

}