import java.util.Scanner;

// 13
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int count = 0;
		int[] check = {a, b, c};
		while(true) {
			if(a % 2 != 0 || b % 2 != 0 || c % 2 != 0) break;
			if(a == b && b == c && c == a) {
				count = -1;
				break;
			}
			int at = a;
			int bt = b;
			a = b / 2 + c / 2;
			b = at / 2 + c / 2;
			c = at / 2 + bt / 2;
			++count;
			
			if(a % 2 != 0 || b % 2 != 0 || c % 2 != 0) break;
			if(a == b && b == c && c == a) {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);
	}

}
