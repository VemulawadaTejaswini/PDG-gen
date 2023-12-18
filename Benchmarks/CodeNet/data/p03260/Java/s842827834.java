import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		if ((A * B) % 2 == 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

	}
}