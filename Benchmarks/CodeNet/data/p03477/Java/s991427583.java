import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),d=scan.nextInt();
		if(a+b<c+d) {
			System.out.println("Right");
		}
		else if(a+b>c+d) {
			System.out.println("Left");
		}
		else if(a+b==c+d) {
			System.out.println("Balanced");
		}

	}

}