import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		if(A%2==0||B%2==0||C%2==0) {
			System.out.println(0);
		}else {
			System.out.println(A*B*C/(Math.max(A, Math.max(B,C))));
		}
	}
}