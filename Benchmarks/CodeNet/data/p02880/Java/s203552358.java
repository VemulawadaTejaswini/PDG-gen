import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		for(int i=1;i<=9;i++) {
			if(N%i==0) {
				int j = N/i;
				if(String.valueOf(j).length() == 1) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");

	}
}