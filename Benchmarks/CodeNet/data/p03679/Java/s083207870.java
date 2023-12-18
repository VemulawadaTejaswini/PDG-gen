import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),a=scan.nextInt(),b=scan.nextInt();
		if(b-a<=0) {
			System.out.println("delicious");
		}
		else if(b-a<=x) {
			System.out.println("safe");
		}
		else {
			System.out.println("dangerous");
		}
	}

}