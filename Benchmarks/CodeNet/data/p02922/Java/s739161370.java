import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		while(true) {
			if((a*count-(count -1)) >=b) {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}

}