import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A,B,C,X;

		try(Scanner sc = new Scanner(System.in)){
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			X = sc.nextInt();
		}

		int ans = 0;

		for(int a = 0; a <= A; a++){
			for(int b = 0; b <= B; b++){
				for(int c = 0; c <= C; c++){
					if((500 * a + 100 * b + 50 * c) == X){
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
	}

}
