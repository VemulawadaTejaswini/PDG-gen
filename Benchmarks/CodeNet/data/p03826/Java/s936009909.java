import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int AB = A*B;
		int CD = C*D;
		
		if(A * B > C * D){
			System.out.println(AB);
		}
		else if(A * B < C * D){
			System.out.print(CD);
		}
		else if(A*B == C*D){
			System.out.print(AB);
		}

	}

}
