import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][];
		int b;
		boolean possible = false;
		a = new int [M][2];
		for (int i=0; i<M; i++){
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		for (int i=0; i<M; i++){
			if (a[i][0] == 1){
				b = a[i][1];
				for (int j=0; j<M; j++){
					if (i != j && a[j][1] == N && b == a[j][0]){
						possible = true;
						break;
					}
				}
			}
		}
		if (possible){
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
