import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int N = 0;
		int x = 0;
		int sum = 0;
		int count = 0;
		int a = 0;
		int b = 0;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		x = scan.nextInt();
		int[] array = new int[N];

		for(int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}

		for(int j = 0; j < N - 1; j++) {
			a = array[j];
			b = array[j + 1];
			sum = a + b;
			if(sum > x) {
				while(sum >= x) {
					if(a > b && sum > x) {
						array[j] = array[j] - 1;
						a = array[j];
						sum = a + b;
						count++;
					}
					else if(a < b && sum > x){
						array[j + 1] = array[j + 1] - 1;
						b = array[j + 1];
						sum = a + b;
						count++;
					}
					else {
						if(sum == x) {
							break;
						}
						else {
							array[j + 1] = array[j + 1] - 1;
							b = array[j + 1];
							sum = a + b;
							count++;
							continue;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}