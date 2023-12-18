import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result;
		if(A != B) {
			if(A >= B) {
				result = A * 2 - 1;
			}else {
				result = B * 2 - 1;
			}
		}else {
			result = A + B;
		}
		System.out.println(result);
	}

}
