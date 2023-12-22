import java.util.*;

public class Main{

	static void Reversing(StringBuffer N){
		N.reverse();
		System.out.print(N);
		return;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n 			= scanner.nextLine();
		StringBuffer N	= new StringBuffer(scanner.nextLine());
		Reversing(N);
		
		scanner.close();
	}

}