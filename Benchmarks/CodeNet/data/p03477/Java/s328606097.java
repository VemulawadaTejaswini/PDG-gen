import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		int AB = A + B;
		int CD = C + D;
		
		int ABCD = AB - CD;
		
		if(ABCD == 0) {
			System.out.println("Balanced");
		}else if(ABCD < 0) {
			System.out.println("Right");
		}else if(ABCD < 0) {
			System.out.println("Left");
		}
		
	}

}
