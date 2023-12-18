import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int A=src.nextInt();
		int B=src.nextInt();
		int i=1;
		if(A>=B) {
				System.out.println(1);
			}
		else
		{
			for(;;) {
				A=(A-1)*2;
				i++;
				if(A>=B) {
					System.out.println(i);
					break;
				}
			}
			
		}

	}

}