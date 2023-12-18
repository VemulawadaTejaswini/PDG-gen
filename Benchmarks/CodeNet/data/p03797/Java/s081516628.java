import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int i;
		for(i = 1 ;; i++) {
			if(N >= 1 && M >= 2) {
				N--;
				M -= 2;
			} else if(M >= 4){
				M -= 4;
			} else {
				System.out.println(i - 1);
				break;
			}
		}
	}
}
