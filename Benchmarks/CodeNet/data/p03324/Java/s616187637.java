import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next();
		sc.close();
		
		if(A == 0){
			System.out.println(B);
		}else if(A == 1){
			System.out.println(B+"00");
		}else{
			System.out.println(B+"0000");
		}	
	}
}