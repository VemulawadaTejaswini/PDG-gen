import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long res = 1L;
		for(int i = 0; i < n; i++){
			res *= sc.nextLong();
			if(res - 1000000000000000000L > 0){
				res = -1;
				break;
			}
		}
		System.out.println(res);
	}
}