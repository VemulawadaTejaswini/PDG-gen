import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//差込口
		int insertPlag = 1;

		int count = 0;

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		while(B > insertPlag) {
			insertPlag += A - 1;
			count++;
		}

		System.out.println(count);
	}
}