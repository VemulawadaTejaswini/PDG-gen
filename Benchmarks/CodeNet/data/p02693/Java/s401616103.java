import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int flag = 0;
		for(int i = a; i <= b; i++){
			if(i % n == 0){
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("OK");
		}else {
			System.out.println("NG");

		}
	}
}
