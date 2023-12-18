import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int num = 0;
		if(k%2 == 0) {
			num = k/2;
			System.out.println(num * num);
		}else {
			num = k/2;
			System.out.println(num * ((k/2)+1));
		}
	}
}