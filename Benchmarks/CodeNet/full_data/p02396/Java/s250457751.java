import java.util.Scanner;

public class sample3b {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			for (int i = 1; i > 0; i++){
				int x = scan.nextInt(); //????????§???????????\???
				if(x == 0){
					break;
				}
				System.out.println("case " + i + ": " + x);
			}
	}
}