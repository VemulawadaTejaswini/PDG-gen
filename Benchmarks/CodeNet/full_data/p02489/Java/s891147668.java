import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1;; i++) {
			if (x != 0) {
			 System.out.printf("Case %d: %d", i, x);
                       }else if(x == 0){
                             break;
		}
	}
}