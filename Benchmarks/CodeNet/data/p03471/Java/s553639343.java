import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		int x = 0; int y = 0; int z = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j =0; j < N; j++) {
				int k = N - (i + j);
				if(10000 * i + 5000 * j + 1000* k == Y){
					System.out.println(i + " " + j + " "+ k);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");	
	}
}
