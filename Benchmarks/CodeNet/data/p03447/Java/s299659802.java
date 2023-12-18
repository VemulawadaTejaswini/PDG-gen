import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated m ethod stub
		Scanner sc = new Scanner(System.in); 
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int result = (X-A)%B;
		System.out.println(result);
	}

} 