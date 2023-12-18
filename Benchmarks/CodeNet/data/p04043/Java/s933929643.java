import java.util.Scanner;

public class Test {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
			int C = sc.nextInt();
			int a = 0, b = 0;

			if(A == 5) a++;
			else if(A == 7) b++;

			if(B == 5) a++;
			else if(B == 7) b++;

			if(C == 5) a++;
			else if(C == 7) b++;

			if(a == 2 && b == 1) System.out.println("YES");
			else System.out.println("NO");
		}
	

}