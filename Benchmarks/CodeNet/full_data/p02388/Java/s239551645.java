import java.io.InputStream;
import java.util.Scanner;

class Main {
	
	public static void main(String[] args){
		
		Scanner In = new Scanner(System.in);
		
		int x = In.nextInt();

		int num = (int)Math.pow(x,3);
		
		System.out.println(num);
		
}
}