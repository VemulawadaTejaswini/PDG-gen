import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();

		int r = 0;
		int b = 0;

		for(int i = 0;i<N;i++) {
			switch(s.charAt(i)) {
			case 'R':
				r++;
				break;
			case 'B':
				b++;
				break;
			default:
				break;
			}
		}

		if(r>b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
