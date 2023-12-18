import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int Christmas = 25;
		int N = sc.nextInt();
		if(N ==25) {
			System.out.println("Christmas");
			System.exit(0);
		}
		System.out.print("Christmas");
		for(int i =0; i<Christmas-N; i++) {
			System.out.print("Eve ");
		}
	}

}
