import java.util.Scanner;
class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = scanner.nextInt();
		
		if(b < a){
			x = a;
			a = b;
			b = x;
			}
		if(c < b){
			x = a;
			a = b;
			b = x;
			}
		if(b < a){
			x = a;
			a = b;
			b = x;
			}
			System.out.println(a+" "+b+"+c);
	}

}