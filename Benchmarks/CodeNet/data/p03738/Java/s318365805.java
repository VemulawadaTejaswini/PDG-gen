import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Long a = stdIn.nextLong();
		Long b = stdIn.nextLong();
		
		if(a>b){
			System.out.println("GREATER");
		}
		if(a<b){
			System.out.println("LESS");
		}
		
		
		if(a==b){
			System.out.println("EQUAL");
		}
	}
}