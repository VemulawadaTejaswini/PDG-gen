import java.util.Scanner;
class Main {
	public void range() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b ) {
			if(a < c) {
				if(b < c) {
					System.out.println("Yes");
				}else { 
					System.out.println("No");
				}
			} else { 
				System.out.println("No");
			}
		} else { 
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		new Main().range();
	}
}