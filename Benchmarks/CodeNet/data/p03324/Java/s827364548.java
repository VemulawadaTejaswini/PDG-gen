import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		String N = sc.next();
		sc.close();
		
		if(D == 0){
			System.out.println(N);
		}else if(D == 1){
			System.out.println(N+"00");
		}else{
			System.out.println(N+"0000");
		}
	}
}