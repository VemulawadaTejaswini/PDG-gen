import java.util.Scanner;

public class Main {
	public  static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		int i = 0;
		int j = 1;
		int sum = 0;
		int H [] = new int[N] ;

		while(i < N) {
			int B = sc.nextInt();
			H[i] = B;
			i++;
		}
		i = 0;
		while(i < N ) {
			while(j < N ) {
				sum = sum + H[i] * H[j];
				j++;
				if(i == j) {
					j++;
				}
			}
			j = 1;
			i++;
		}
		System.out.println(sum);
	}
}