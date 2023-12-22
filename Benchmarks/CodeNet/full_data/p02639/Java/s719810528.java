import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A = new int[5];

		for(int i=0; i<5; i++) {
			A[i] = sc.nextInt();
		}

		for(int x : A) {
			int count = 1;
			if(x==0) {
				System.out.print(count);
				break;
			}
			count++;
		}
	}

}
