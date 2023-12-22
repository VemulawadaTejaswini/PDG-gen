import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A = new int[5];

		for(int i=0; i<5; i++) {
			A[i] = sc.nextInt();
		}

		int count = 1;
		for(int x : A) {
			if(x==0) {
				System.out.print(count);
				break;
			}
			count++;
		}
	}

}
