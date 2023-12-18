import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int A=src.nextInt();
		int B=src.nextInt();
		int i=1;
		int S;
		if(A>=B) {
				System.out.println(1);
			}
		else
		{
			for(;;i++) {
				S=A*i-i+1;;
			
				if(S>=B) {	
					System.out.println(i);
					break;
				}
			}
			
		}

	}

}
