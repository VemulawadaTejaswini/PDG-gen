import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, k, g = 1, vet[];
		Scanner scanner = new Scanner (System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		k = scanner.nextInt();
		vet = new int[100];
		int j = 0;
		
		for(int i = 0; i < 100; i++) {
			if(a % g == 0 && b % g == 0) {
				vet[j] = g;
				j++;
			}
			g++;
		}
		System.out.println(vet[k-1]);
	}
}