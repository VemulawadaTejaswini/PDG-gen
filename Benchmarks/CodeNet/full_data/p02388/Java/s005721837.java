import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a=0;
		
		
		Scanner scanner=new Scanner(System.in);
			a=scanner.nextInt();
		if(a<100||a>0) {
		a=a*a*a;
		
		System.out.println(a);
		}
	}

}