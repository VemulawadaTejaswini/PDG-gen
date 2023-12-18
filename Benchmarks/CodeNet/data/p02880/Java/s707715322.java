
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int flag = 0;
		for(int i = 1; i < 10; i++) {
			double b = a/i;
          	double c = a%i;
			if(b<=9&&c==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
