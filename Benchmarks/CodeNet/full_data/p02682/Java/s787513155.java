import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int sum = 0;
		for(int i = 0; i < k; i++) {
			if(a > 0) {
				sum += 1;
				a -= 1;
			}else if(b > 0) {
				b -= 1;
			}else if(c > 0){
				sum -= 1;
				c -= 1;
			}
		}
		System.out.println(sum);

	}
}
