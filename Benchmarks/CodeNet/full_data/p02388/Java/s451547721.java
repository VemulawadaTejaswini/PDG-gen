public class Main{
	public static void main(String[] args){
		int result = 0;
			System.out.println("Enter Number : "  );
			Scanner stdin = new Scanner(System.in);		
			// Read Integer from standard input
			int number = stdin.nextInt();
			if(number >=1 || number <= 100){
				result = number * number * number;
				System.out.println(result);
			}else{
				System.out.println("Please enter 1 to 100");
			}
 }
}