import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int N = 0;
		int x = 0;
		int sum = 0;
		int count = 0;
		int a = 0;
		int b = 0;
		ArrayList<Integer> Array = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		x = scan.nextInt();

		for(int i = 0; i < N; i++) {
			Array.add(scan.nextInt());
		}

		for(int j = 0; j < N - 1; j++) {
			a = Array.get(j);
			b = Array.get(j + 1);
			sum = a + b;
			if(sum > x) {
				while(sum >= x) {
					if(a > b && sum > x) {
						Array.set(j, a - 1);
						a = Array.get(j);
						sum = a + b;
						count++;
					}
					else if(a < b && sum > x){
						Array.set(j + 1, b - 1);
						b = Array.get(j + 1);
						sum = a + b;
						count++;
					}
					else {
						if(sum == x) {
							break;
						}
						else {
							Array.set(j + 1, b - 1);
							b = Array.get(j + 1);
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