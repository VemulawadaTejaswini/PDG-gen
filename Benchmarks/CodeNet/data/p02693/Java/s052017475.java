import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int num = 0;
		
		for(int i = A; i <= B; i++) {
			if(i%K == 0) {
				num = num +1;
			}
		}
		
		if(num >= 1) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		sc.close();
	}
}