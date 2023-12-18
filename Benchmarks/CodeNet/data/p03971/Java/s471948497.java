import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// get a string
		String s = sc.next();
		
		Main.qualif(a, b, c, s);
	}
	
	static void qualif(int N, int A, int B, String str) {
		int number = 0;
		int numberB = 0;
		int threshold = A + B;
		StringBuilder s = new StringBuilder(str);
		
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == 'a' && number < threshold){
				number++;
				//System.out.println("num = " + number);
				System.out.print("Yes");
			}
			else if (s.charAt(i) == 'b' && number < threshold && numberB < B) {
				number++;
				numberB++;
				System.out.print("Yes");
			}
			else
				System.out.print("NO");

                       if (i != N-1)
				System.out.print("\n");
		}
	}

}