import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Long a = stdIn.nextLong();
		Long b = stdIn.nextLong();
		
		if(Math.log(a)>Math.log(b)){
			System.out.println("GREATER");
		}
		if(Math.log(a)>Math.log(b)){
			System.out.println("LESS");
		}
		
		
		if(Math.log(a)>Math.log(b)){
			System.out.println("EQUAL");
		}
	}
}