public class Main {
	public static void main(String[] args) {
		long i = 0;
		while(true){
			long x = new java.util.Scanner(System.in).nextInt();
			
			if ( x == 0 ) {
				break;
			}
			
			++i;
			System.out.println("Case " + i + ": " + x );
		}
		
	}
}